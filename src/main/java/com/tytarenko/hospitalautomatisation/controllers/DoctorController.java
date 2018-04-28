package com.tytarenko.hospitalautomatisation.controllers;

import com.tytarenko.hospitalautomatisation.entities.Recipe;
import com.tytarenko.hospitalautomatisation.entities.Recommendation;
import com.tytarenko.hospitalautomatisation.services.interfaces.DoctorService;
import com.tytarenko.hospitalautomatisation.services.interfaces.PatientService;
import com.tytarenko.hospitalautomatisation.services.interfaces.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private ServiceInterface<Recommendation> recommendationService;

    @Autowired
    private ServiceInterface<Recipe> recipeService;

    @GetMapping("/{passport}")
    public ModelAndView doctor(@PathVariable("passport") String passport) {
        Map<String, Object> model = new HashMap<>();
        model.put("doctor", doctorService.getByPassport(passport));
        return new ModelAndView("doctor", model);
    }

    @GetMapping("/{passport}/all-patients")
    public ModelAndView getAllPatients(@PathVariable("passport") String passport) {
        Map<String, Object> model = new HashMap<>();
        model.put("patients-list", patientService.getPatientsOfDoctor(passport));
        model.put("doctor", doctorService.getByPassport(passport));
        return new ModelAndView("doctor-patient-list", model);
    }

    @GetMapping("/{passport}/all-patients/{patient_passport}")
    public ModelAndView getPatientById(@PathVariable("patient_passport") String passport,
                                       @PathVariable("passport") String docPassport) {
        Map<String, Object> model = new HashMap<>();
        model.put("patient", patientService.getPatientByPassport(passport));
        model.put("doctor", doctorService.getByPassport(docPassport));
        return new ModelAndView("doctor-patient", model);
    }

    @GetMapping("/{passport}/all-patients/{patient_passport}/recommendations")
    public ModelAndView getRecomendation(@PathVariable("patient_passport") String passport,
                                         @PathVariable("passport") String docPassport) {
        Map<String, Object> model = new HashMap<>();
        model.put("recommendations-list", recommendationService.get(passport));
        model.put("doctor", doctorService.getByPassport(docPassport));
        return new ModelAndView("recommendations", model);
    }

    @GetMapping("/{passport}/all-patients/{patient_passport}/add_recommendation")
    public ModelAndView addRecomendation(@PathVariable("passport") long id) {
        return new ModelAndView("add-recommendation");
    }

    @PostMapping("/{passport}/all-patients/{id}/add_recommendation")
    public ModelAndView addRecomendation(@ModelAttribute("recommendation") Recommendation recommendation) {
        recommendationService.add(recommendation);
        return new ModelAndView("redirect:/doctor/all-patients/{id}/recommendations");
    }

    @GetMapping("/{passport}/all-patients/{patient_passport}/recipe")
    public ModelAndView getRecipe(@PathVariable("passport") String docPassport,
                                  @PathVariable("patient_passport") String passport) {
        Map<String, Object> model = new HashMap<>();
        model.put("recipe-list", recipeService.get(passport));
        model.put("doctor", doctorService.getByPassport(docPassport));
        return new ModelAndView("recipies", model);
    }

    @GetMapping("/{passport}/all-patients/{patient_passport}/add_recipe")
    public ModelAndView addRecipe(@PathVariable("passport") String docPassport,
                                  @PathVariable("patient_passport") String passport) {
        Map<String, Object> model = new HashMap<>();
        model.put("doctor", doctorService.getByPassport(docPassport));
        model.put("patient", patientService.getPatientByPassport(passport));
        return new ModelAndView("add-recipe", model);
    }

    @PostMapping("/{passport}/all-patients/{patient_passport}/add_recipe")
    public ModelAndView addRecipe(@ModelAttribute("recipe") Recipe recipe) {
        recipeService.add(recipe);
        return new ModelAndView("redirect:/doctor/all-patients/{id}");
    }
}

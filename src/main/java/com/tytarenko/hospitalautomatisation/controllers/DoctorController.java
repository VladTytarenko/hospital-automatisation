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

    @GetMapping("/doctor/{passport}")
    public ModelAndView doctor(@PathVariable("passport") String passport) {
        Map<String, Object> model = new HashMap<>();
        model.put("doctor", doctorService.getByPassport(passport));
        return new ModelAndView("doctor", model);
    }

    @GetMapping("/all-patients")
    public ModelAndView getAllPatients() {
        Map<String, Object> model = new HashMap<>();
        model.put("patients-list", patientService.getAllPatient());
        return new ModelAndView("doctor-patient-list", model);
    }

    @GetMapping("/all-patients/{id}")
    public ModelAndView getPatientById(@PathVariable long id) {
        Map<String, Object> model = new HashMap<>();
        model.put("patient", patientService.getPatientById(id));
        return new ModelAndView("doctor-patient", model);
    }

    @GetMapping("/all-patients/{id}/recommendations")
    public ModelAndView getRecomendation(@PathVariable("id") long id) {
        Map<String, Object> model = new HashMap<>();
        model.put("recommendations-list", recommendationService.get(id));
        return new ModelAndView("recommendations", model);
    }

    @GetMapping("/all-patients/{id}/add_recommendation")
    public ModelAndView addRecomendation(@PathVariable("id") long id) {
        return new ModelAndView("add-recommendation");
    }

    @PostMapping("/all-patients/{id}/add_recommendation")
    public ModelAndView addRecomendation(@ModelAttribute("recommendation") Recommendation recommendation) {
        recommendationService.add(recommendation);
        return new ModelAndView("redirect:/doctor/all-patients/{id}/recommendations");
    }

    @GetMapping("/all-patients/{id}/add_recipe")
    public ModelAndView addRecipe(@PathVariable("id") long id) {
        Map<String, Object> model = new HashMap<>();
        model.put("id", id);
        return new ModelAndView("add-recipe", model);
    }

    @PostMapping("/all-patients/{id}/add_recipe")
    public ModelAndView addRecipe(@ModelAttribute("recipe") Recipe recipe) {
        recipeService.add(recipe);
        return new ModelAndView("redirect:/doctor/all-patients/{id}");
    }
}

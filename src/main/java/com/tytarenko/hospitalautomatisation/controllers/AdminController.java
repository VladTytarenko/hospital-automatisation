package com.tytarenko.hospitalautomatisation.controllers;

import com.tytarenko.hospitalautomatisation.entities.Patient;
import com.tytarenko.hospitalautomatisation.services.interfaces.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/all_patients")
    public ModelAndView getAllPatients() {
        Map<String, Object> model = new HashMap<>();
        model.put("patients_list", patientService.getAllPatient());
        return new ModelAndView("all-patients", model);
    }

    @GetMapping("/all_patients/{id}")
    public ModelAndView getPatientById(@PathVariable("id") long id) {
        Map<String, Object> model = new HashMap<>();
        model.put("patient", patientService.getPatientById(id));
        return new ModelAndView("patient", model);
    }

    @GetMapping("/all_patients/registration_patients")
    public ModelAndView registrationPatients() {
        return new ModelAndView("registration");
    }

    @PostMapping("/all_patients/registration_patients")
    public ModelAndView registrationPatients(@ModelAttribute("patient") Patient patient) {
        patientService.insetNewPatient(patient);
        return new ModelAndView("redirect:/admin/all_patients");
    }

    @GetMapping("/all_patients/{id}/update")
    public ModelAndView updatePatient(@PathVariable("id") long id) {
        Map<String, Object> model = new HashMap<>();
        model.put("patient", patientService.getPatientById(id));
        return new ModelAndView("patient-update", model);
    }

    @PostMapping("/all_patients/{id}/update")
    public ModelAndView updatePatient(@PathVariable("id") String id,
                                      @ModelAttribute("patient") Patient patient) {
        patientService.updatePatient(patient, id);
        return new ModelAndView("redirect:/admin/all_patients/" + id);
    }

    @GetMapping("/all_patients/{id}/delete")
    public ModelAndView deletePatient(@PathVariable("id") long id) {
        patientService.deletePatientById(id);
        return new ModelAndView("redirect:/admin/all_patients");
    }
}

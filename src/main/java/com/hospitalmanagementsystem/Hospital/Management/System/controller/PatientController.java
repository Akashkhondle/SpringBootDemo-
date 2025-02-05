package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.Model.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.Model.Patient;
import com.hospitalmanagementsystem.Hospital.Management.System.service.PatientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    PatientService patientService = new PatientService();
    @PostMapping("/api/patient/register")
    public Hospital registerPatient(@RequestBody Patient patient)
    {
       Hospital hospital = patientService.registerPatient(patient);
       return hospital;
    }
}

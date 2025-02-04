package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.Model.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.service.HospitalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HospitalController {
   // @RestController
   HospitalService hospitalService = new HospitalService();
   @GetMapping("/api/hospitals")
    public List<Hospital> getAllHospital(){

       List<Hospital> hospitals = hospitalService.getAllHospitals();
       return hospitals;

    }
    int count =0;
    @PostMapping("/api/addhospital")
    public String addHospital(){
       Hospital hospital = new Hospital();
       hospital.name = "Akash";
       hospital.id =count;
       String id = count + "";
       count++;
       hospitalService.addHospital(id,hospital);
       return "Hospital object got added";

    }
    @GetMapping("/api/sayhello")
    public String sayHello()
    {

        return "hello";
    }

    @GetMapping("/api/sayBye")
    public String sayBye()
    {

        return "Bye";
    }

    @PostMapping("/api/createpost")
    public String createPost()
    {
        return "Create Post";
    }
}

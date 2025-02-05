package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.Model.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class HospitalService {
    @Autowired
    HospitalRepository hospitalRepository;
    public List<Hospital> getAllHospitals(){


        HashMap<String, Hospital> hospitalDB = hospitalRepository.getAllHospital();

        List<Hospital> allHospitals = new ArrayList<>();
        for(String hospitalID: hospitalDB.keySet())
        {
            Hospital hospital = hospitalDB.get(hospitalID);
            allHospitals.add(hospital);
        }
        return allHospitals;
    }
    public void addHospital(String id,Hospital hospital)
    {
        hospitalRepository.addHospital(id,hospital);
    }


    public Hospital getHospitalDetailById(int id)
    {
        return hospitalRepository.getHospitalDetailById(id);
    }
}

package com.hospitalmanagementsystem.Hospital.Management.System.repository;

import com.hospitalmanagementsystem.Hospital.Management.System.Model.Hospital;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Repository
public class HospitalRepository {
    HashMap<String,Hospital> hospitalDB = new HashMap<>();

   public HashMap<String,Hospital> getAllHospital(){
       return hospitalDB;
   }

   public void addHospital(String id,Hospital hospital){
       hospitalDB.put(id,hospital);
   }
}

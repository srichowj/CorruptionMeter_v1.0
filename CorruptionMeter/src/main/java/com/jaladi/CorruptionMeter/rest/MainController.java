package com.jaladi.CorruptionMeter.rest;

import com.jaladi.CorruptionMeter.Model.GenericResponse;
import com.jaladi.CorruptionMeter.Model.OfficerDetailsRequest;
import com.jaladi.CorruptionMeter.service.OfficerDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class MainController {

    @Autowired
    private OfficerDetailsServiceImpl officerDetailsServiceImpl;
    @GetMapping ("/api/HealthApi")
    public ResponseEntity<GenericResponse> Health(OfficerDetailsRequest request){
        //officerDetailsServiceImpl.updateOfficerDetails(request);

        GenericResponse response = new GenericResponse();
        response.setMessage("Application's Health is fine :)");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @PutMapping ("/api/updateofficerdetails")
    public ResponseEntity<GenericResponse> updateOfficerDetails(@RequestBody OfficerDetailsRequest request){
        officerDetailsServiceImpl.updateOfficerDetails(request);
        GenericResponse response = new GenericResponse();
        response.setMessage("Update is successfull");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

package com.jaladi.CorruptionMeter.service;

import com.jaladi.CorruptionMeter.Model.GenericResponse;
import com.jaladi.CorruptionMeter.Model.OfficerDetailsRequest;
import com.jaladi.CorruptionMeter.dao.OfficerDetailsRepository;
import com.jaladi.CorruptionMeter.entity.OfficerDetailsEntity;
import org.hibernate.jpa.internal.util.LogHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OfficerDetailsServiceImpl {
@Autowired
    OfficerDetailsRepository officerRepository;
public GenericResponse updateOfficerDetails (OfficerDetailsRequest request){
   // LogHelper.info(this, "Start of updateOfficerDetails");
    GenericResponse response = new GenericResponse();
    response.setMessage("Data save is successful");
    try{
        OfficerDetailsEntity entity = new OfficerDetailsEntity();
        entity.setId(Long.valueOf(request.getId()));
        entity.setSku(request.getSku());
        entity.setDescription(request.getDescription());
        entity.setDepartment(request.getDepartment());
        entity.setName(request.getName());
        entity.setActive(request.isActive());
        entity.setCorruptionscore(request.getCorruptionscore());
        entity.setCategoryId(request.getCategoryId());//String.valueOf(222)

        entity.setLastUpdated(new Date());
        officerRepository.save(entity);
    }catch(Exception e){
     //   LogHelper.error(this, e);
        e.printStackTrace();
    }
    //LogHelper.info(this, "End of updateOfficerDetails");
    return response;
}

}

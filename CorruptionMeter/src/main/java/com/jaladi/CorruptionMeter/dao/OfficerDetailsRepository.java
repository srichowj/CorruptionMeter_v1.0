package com.jaladi.CorruptionMeter.dao;

import com.jaladi.CorruptionMeter.entity.OfficerDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "officerdetails" , path = "officer-details" )
@CrossOrigin()
public interface OfficerDetailsRepository extends JpaRepository<OfficerDetailsEntity, Long> {


}

package com.example.cp3566resumesite.dao;

import org.springframework.data.repository.CrudRepository;

/**
 * Repository for all student Educations
 *
 * @author Nathan Atkins
 */
public interface EducationRepository extends CrudRepository <Education, Integer> {
    /*
        If we need specialized queries beyond those included in CrudRepository we can engage here or in the Repository interface
        But we only need CRUD so don't populate this interface
    */
}

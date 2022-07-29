package com.example.cp3566resumesite.dao;

import org.springframework.data.repository.CrudRepository;

/**
 * Repository for all student Skills
 *
 * @author Nathan Atkins
 */
public interface SkillsRepository extends CrudRepository<Skills, Integer> {
    /*
        If we need specialized queries beyond those included in CrudRepository we can engage here or in the Repository interface
        But we only need CRUD so don't populate this interface
    */
}

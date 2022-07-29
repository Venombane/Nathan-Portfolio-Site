package com.example.cp3566resumesite.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Simple class to represent a students skills. This class
 * represents a single skill. Students may have many of these.
 *
 * Skill has the following attributes:
 *  - ID - for DB purposes, primary key
 *  - Name - skill name. ie. "React"
 *  - Type - type of skill
 *
 * @author Nathan Atkins
 */
@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

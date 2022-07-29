package com.example.cp3566resumesite.dao;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Simple class to represent a students experience. This class
 * represents a single experience. Students may have many of these.
 *
 * Experience has the following attributes:
 *  - ID - for DB purposes, primary key
 *  - Start Date - start date for job
 *  - End Date - end date for job
 *  - Title - name of the job
 *  - Company Name - name of the company
 *  - Description - what the job was about
 *
 * @author Nathan Atkins
 */
@Entity(name = "experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd") //yyyy-MM-dd
    private LocalDate startDate;

    @JsonFormat (pattern = "yyyy-MM-dd") //yyyy-MM-dd
    private LocalDate endDate;

    private String title;
    private String companyName;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

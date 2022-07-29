package com.example.cp3566resumesite.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.Optional;

/**
 * The main controller for the course project
 *
 * This will handle requests for Education.
 * This will handle requests for Experiences
 * This will handle requests for Skills
 *
 * @author Nathan Atkins
 */
@RestController
@RequestMapping(path = "/api")
public class MainController {

    //Constants used in REST API definition
    public static final String VERSION_1 = "/v1";
    public static final String EDUCATION = "/educations";
    public static final String EXPERIENCE = "/experiences";
    public static final String SKILL = "/skills";

    /**
     * Links to the education database
     */
    @Autowired
    private EducationRepository educationRepository;

    /**
     * Gets all education from the database
     * @return all educations
     */
    @GetMapping(path=VERSION_1 + EDUCATION)
    public @ResponseBody
    Iterable<Education> getAllEducations(){
        return educationRepository.findAll();
    }

    /**
     * Gets an education from the database based on its id.
     * @param id id
     * @return an education
     */
    @GetMapping(path = VERSION_1 + EDUCATION + "/{id}")
    public @ResponseBody
    Optional<Education> getEducationWithId(@PathVariable Integer id){
        return educationRepository.findById(id);
    }

    /**
     * Updates an education based on its id / creates a new one if not there
     * @param id id
     * @param title title
     * @param institutionName institution name
     * @param gradYear grad year
     * @param startDate start date
     * @param endDate end date
     * @param abbreviation abbreviation
     * @return updated or added
     */
    @PutMapping(path = VERSION_1 + EDUCATION)
    public @ResponseBody
    String updateEducation(@RequestParam Integer id,@RequestParam String title,
                           @RequestParam String institutionName, @RequestParam Integer gradYear,
                           @RequestParam LocalDate startDate, @RequestParam LocalDate endDate,
                           @RequestParam String abbreviation){
        Optional<Education> optionalEducation = educationRepository.findById(id);
        if(optionalEducation.isPresent()){
            Education education = optionalEducation.get();
            education.setTitle(title);
            education.setInstitutionName(institutionName);
            education.setGradYear(gradYear);
            education.setStartDate(startDate);
            education.setEndDate(endDate);
            education.setAbbreviation(abbreviation);
            educationRepository.save(education);
            return "Updated";
        } else {
            Education education = new Education();
            education.setTitle(title);
            education.setInstitutionName(institutionName);
            education.setGradYear(gradYear);
            education.setStartDate(startDate);
            education.setEndDate(endDate);
            education.setAbbreviation(abbreviation);
            educationRepository.save(education);
            return "Added";
        }
    }

    /**
     * Add a new education to the database
     * @param title title
     * @param institutionName institution name
     * @param gradYear grad year
     * @param startDate start date
     * @param endDate end date
     * @param abbreviation abbreviation
     * @return saved
     */
    @PostMapping(path=VERSION_1 + EDUCATION)
    public @ResponseBody
    String addNewEducation(@RequestParam String title,
                           @RequestParam String institutionName, @RequestParam Integer gradYear,
                           @RequestParam LocalDate startDate, @RequestParam LocalDate endDate,
                           @RequestParam String abbreviation){
        Education education = new Education();
        education.setTitle(title);
        education.setInstitutionName(institutionName);
        education.setGradYear(gradYear);
        education.setStartDate(startDate);
        education.setEndDate(endDate);
        education.setAbbreviation(abbreviation);
        educationRepository.save(education);
        return "Saved";
    }

    /**
     * Deletes a education based on id from database
     * @param id id
     * @return deleted
     */
    @DeleteMapping(path = VERSION_1 + EDUCATION)
    public @ResponseBody
    String deleteEducation(@RequestParam Integer id){
        educationRepository.deleteById(id);
        return "deleted";
    }



    /**
     * Links to the experience database.
     */
    @Autowired
    private ExperienceRepository experienceRepository;

    /**
     * Gets all experiences from the database
     * @return all experiences
     */
    @GetMapping(path = VERSION_1 + EXPERIENCE)
    public @ResponseBody
    Iterable<Experience> getAllExperience() {
        return experienceRepository.findAll();
    }

    /**
     * Gets an experience from the database based on its id
     * @param id id
     * @return an experience
     */
    @GetMapping(path = VERSION_1 + EXPERIENCE + "/{id}")
    public @ResponseBody
    Optional<Experience> getExperienceWithID(@PathVariable Integer id) {
        return experienceRepository.findById(id);
    }

    /**
     * Updates an existing experience or adds it if not there
     * @param id id
     * @param startDate start date
     * @param endDate end date
     * @param title title
     * @param companyName company name
     * @param description description
     * @return updated or saved
     */
    @PutMapping(path = VERSION_1 + EXPERIENCE)
    public @ResponseBody
    String updateEducation(@RequestParam Integer id,@RequestParam LocalDate startDate,
                           @RequestParam LocalDate endDate, @RequestParam String title,
                           @RequestParam String companyName, @RequestParam String description){
        Optional<Experience> optionalExperience = experienceRepository.findById(id);
        if(optionalExperience.isPresent()){
            Experience experience = optionalExperience.get();
            experience.setStartDate(startDate);
            experience.setEndDate(endDate);
            experience.setTitle(title);
            experience.setCompanyName(companyName);
            experience.setDescription(description);
            experienceRepository.save(experience);
            return "Updated";
        } else {
            Experience experience = new Experience();
            experience.setStartDate(startDate);
            experience.setEndDate(endDate);
            experience.setTitle(title);
            experience.setCompanyName(companyName);
            experience.setDescription(description);
            experienceRepository.save(experience);
            return "Saved";
        }
    }

    /**
     * Adds a new experience to the database
     * @param startDate start date
     * @param endDate end date
     * @param title job title
     * @param companyName company name
     * @param description description
     * @return saved
     */
    @PostMapping(path = VERSION_1 + EXPERIENCE)
    public @ResponseBody
    String addNewExperience(@RequestParam LocalDate startDate,
                            @RequestParam LocalDate endDate, @RequestParam String title,
                            @RequestParam String companyName, @RequestParam String description) {
        Experience experience = new Experience();
        experience.setStartDate(startDate);
        experience.setEndDate(endDate);
        experience.setTitle(title);
        experience.setCompanyName(companyName);
        experience.setDescription(description);
        experienceRepository.save(experience);
        return "Saved";
    }

    /**
     * Deletes an experience based on id
     * @param id id
     * @return deleted
     */
    @DeleteMapping(path = VERSION_1 + EXPERIENCE)
    public @ResponseBody
    String deleteExperience(@RequestParam Integer id) {
        experienceRepository.deleteById(id);
        return "deleted";
    }

    /**
     * Links the skillsRepository to the database
     */
    @Autowired
    private SkillsRepository skillsRepository;

    /**
     * Gets all skills from the skills database
     * @return all skills
     */
    @GetMapping(path = VERSION_1 + SKILL)
    public @ResponseBody
    Iterable<Skills> getAllSkills (){
        return skillsRepository.findAll();
    }

    /**
     * Gets all the skills based on their id
     * @param id id
     * @return all skills with id
     */
    @GetMapping(path = VERSION_1 + SKILL + "/{id}")
    public @ResponseBody
    Optional<Skills> getSkillsWithID(@PathVariable Integer id) {
        return skillsRepository.findById(id);
    }

    /**
     *
     * @param id id
     * @param name name
     * @param type type
     * @return updated or saved
     */
    @PutMapping(path = VERSION_1 + SKILL)
    public @ResponseBody
    String updateSkill(@RequestParam Integer id,@RequestParam String name,
                       @RequestParam String type){
        Optional<Skills> optionalSkills = skillsRepository.findById(id);
        if(optionalSkills.isPresent()){
            Skills skills = optionalSkills.get();
            skills.setName(name);
            skills.setType(type);
            skillsRepository.save(skills);
            return "Updated";
        } else {
            Skills skills = new Skills();
            skills.setName(name);
            skills.setType(type);
            skillsRepository.save(skills);
            return "Saved";
        }
    }

    /**
     * Adds a skill to the skills database
     * @param name name
     * @param type type
     * @return Saved
     */
    @PostMapping(path = VERSION_1 + SKILL)
    public @ResponseBody
    String addNewSkills(@RequestParam String name,
                        @RequestParam String type) {
        Skills skills = new Skills();
        skills.setName(name);
        skills.setType(type);
        skillsRepository.save(skills);
        return "Saved";
    }

    /**
     * Deleting skill from skills database by id
     * @param id id
     * @return deleted
     */
    @DeleteMapping(path = VERSION_1 + SKILL)
    public @ResponseBody
    String deleteSkills(@RequestParam Integer id) {
        skillsRepository.deleteById(id);
        return "deleted";
    }
}
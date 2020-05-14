package org.udemy.springcourse.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.udemy.springcourse.course.model.Personnage;

@RestController
public class PersonnageController {

    @GetMapping("/personnage")
    public Personnage getPersonnage() {
        return new Personnage("Sangoku", 10, "Kamehameha");
    }
}

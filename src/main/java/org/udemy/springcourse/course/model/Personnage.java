package org.udemy.springcourse.course.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personnage {

    private String nom;
    private int level;
    private String attaque;

}

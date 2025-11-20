package com.polytech;
import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Cours c = new CoursBuilder()
                        .setMatiere("GL")
                        .setEnseignant("Mme Lilia")
                        .setSalle("B12")
                        .setDate("2025-02-12")
                        .setHeureDebut("10:00")
                        .setEstOptionnel(false)
                        .setNiveau("L3")
                        .setNecessiteProjecteur(true)
                        .build();

        System.out.println(c.getDescription());
    }
}


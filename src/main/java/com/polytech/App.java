package com.polytech;

import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Cours c = new CoursBuilder()
                .setMatiere("Maths")
                .setEnseignant("Dupont")
                .setSalle("B203")
                .setDate("15/02/2025")
                .setHeureDebut("10:00")
                .setOptionnel(false)
                .setNiveau("L3")
                .setNecessiteProjecteur(true)
                .build();

        System.out.println(c.getDescription());

    }
}

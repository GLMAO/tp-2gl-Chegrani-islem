package com.polytech.tp;

public class CoursBuilder {
    // mêmes champs que Cours
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;

    // setters fluides (chaque setter retourne this)
    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }

    public CoursBuilder setOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }

    // build() : fabrique et retourne un objet Cours
    public Cours build() {
        // validations simples (optionnel) : on exige matiere et enseignant non null
        if (matiere == null || matiere.isEmpty()) {
            throw new IllegalStateException("La matière est requise.");
        }
        if (enseignant == null || enseignant.isEmpty()) {
            throw new IllegalStateException("L'enseignant est requis.");
        }

        // Appelle le constructeur existant de Cours
        return new Cours(matiere, enseignant, salle, date, heureDebut, estOptionnel, niveau, necessiteProjecteur);
    }
}

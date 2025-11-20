package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject{
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> listners = new ArrayList<>();
    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // TODO: C'est ici qu'il faudrait notifier les étudiants (Observer pattern)
        this.notifyObservers("Nouveau cours ajouté");
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // TODO: Notifier les observateurs ici aussi
        this.notifyObservers(message);
    }

    public void setChangement(String string) {
        // TODO Auto-generated method stub
        this.notifyObservers(string);
        //throw new UnsupportedOperationException("Unimplemented method 'setChangement'");
    }

    @Override
    public void attach(Observer o) {
        this.listners.add(o);
    }

    @Override
    public void detach(Observer o) {
        this.listners.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer i : this.listners){
            i.update(message);
        }
    }
    //public void notifyStudents(String message){}
}
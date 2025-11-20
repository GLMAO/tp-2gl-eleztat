package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private Cours coursActuel;

    // Implémentation des méthodes de Subject
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // Notifier les observateurs
        notifyObservers("Nouveau cours ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // Notifier les observateurs
        notifyObservers("Cours modifié : " + message);
    }

    public void setChangement(String message) {
       
        notifyObservers(message);
    }

    // Méthode pour simuler l'annulation d'un cours
    public void annulerCours(ICours cours) {
        listeCours.remove(cours);
        notifyObservers("Cours annulé : " + cours.getDescription());
    }

    // Getter pour les tests
    public List<Observer> getObservers() {
        return new ArrayList<>(observers);
    }
}
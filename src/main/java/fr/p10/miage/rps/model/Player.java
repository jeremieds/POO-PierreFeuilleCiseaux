package fr.p10.miage.rps.model;

public class Player {
    String nom;
    int score;
    RPSEnum mouvements;

    public Player(String nom, RPSEnum mouvements) {
        this.nom = nom;
        this.mouvements = mouvements;
    }

    public Player(String nom) {
        this.nom = nom;
    }
}

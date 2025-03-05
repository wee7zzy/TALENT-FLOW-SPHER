package OffreEmploi.Model;

import Recruteur.MODEL.Recruteurs;

import java.time.LocalDateTime;

public class OffreEmploiModel {

        private int id;
        private String title;
        private String description;
        private Recruteurs recruteurs;
        private LocalDateTime createdAt;

        public OffreEmploiModel(String title, String description, Recruteurs recruteurs ) {
            this.title = title;
            this.description = description;
            this.recruteurs =recruteurs ;
            this.createdAt = LocalDateTime.now();
        }

        // Getters and Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
        public Recruteurs getRecruiter() { return recruteurs; }
        public void setRecruiter(Recruteurs recruiter) { this.recruteurs = recruiter; }
        public LocalDateTime getCreatedAt() { return createdAt; }
    }
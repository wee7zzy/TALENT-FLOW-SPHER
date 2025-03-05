package OffreEmploi.Model;

public class OffreEmploiModel {
    private String nom;
    private String description;
    private String adresse;

    public OffreEmploiModel(String nom, String description, String adresse) {
        this.nom = nom;
        this.description = description;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "OffreEmploiModel{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}

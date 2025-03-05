package Candidatures.Candidate.Model;



public class CandidateModel {
    private int id;
    private String nom;
    private String email;
    private String telephone;
    private String cv; // URL ou chemin du fichier CV

    public CandidateModel() {}

    public CandidateModel(int id, String nom, String email, String telephone, String cv) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.cv = cv;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getCv() { return cv; }
    public void setCv(String cv) { this.cv = cv; }
}

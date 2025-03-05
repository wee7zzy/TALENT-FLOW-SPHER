package Candidatures.Recruteur.Model;

public class RecruteurModel {
    private int id;
    private String nom;
    private String email;
    private String motDePasse;
    private String entreprise;

    // Constructeurs
    public RecruteurModel() {}

    public RecruteurModel(int id, String nom, String email, String motDePasse, String entreprise) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.entreprise = entreprise;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public String getEntreprise() { return entreprise; }
    public void setEntreprise(String entreprise) { this.entreprise = entreprise; }
}

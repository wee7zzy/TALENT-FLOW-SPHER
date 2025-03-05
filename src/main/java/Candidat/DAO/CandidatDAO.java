package Candidat.DAO;


import Candidat.Model.UserModel;

// Candidate Class
public class CandidatDAO extends UserModel {
    private String phone;
    private String cvPath;

    public CandidatDAO(String name, String email, String password, String phone, String cvPath) {
        super(name, email, password, UserRole.CANDIDATE);
        this.phone = phone;
        this.cvPath = cvPath;
    }

    public CandidatDAO(String name, String email, String password, UserRole role) {
        super(name, email, password, role);
    }

    // Getters and Setters
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getCvPath() { return cvPath; }
    public void setCvPath(String cvPath) { this.cvPath = cvPath; }
}
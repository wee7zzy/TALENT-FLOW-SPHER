package Recruteur.MODEL;

public class Recruteurs extends User{

        private String company;

        public Recruteurs(String name, String email, String password, String company) {
            super(name, email, password, UserRole.RECRUITER);
            this.company = company;
        }

        // Getters and Setters
        public String getCompany() { return company; }
        public void setCompany(String company) { this.company = company; }
    }


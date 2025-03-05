package Candidatures.Recruteur.DAO;

import Candidatures.Recruteur.Model.RecruteurModel;
import Utils.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecruteutDAO {

    // Ajouter un recruteur
    public void ajouterRecruteur(RecruteurModel recruteur) {
        String sql = "INSERT INTO recruteurs (nom, email, motDePasse, entreprise) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, recruteur.getNom());
            ps.setString(2, recruteur.getEmail());
            ps.setString(3, recruteur.getMotDePasse());
            ps.setString(4, recruteur.getEntreprise());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Récupérer un recruteur par email
    public RecruteurModel getRecruteurByEmail(String email) {
        String sql = "SELECT * FROM recruteurs WHERE email = ?";
        RecruteurModel recruteur = null;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                recruteur = new RecruteurModel(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getString("email"),
                        rs.getString("motDePasse"),
                        rs.getString("entreprise")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return recruteur;
    }

    // Récupérer la liste des recruteurs
    public List<RecruteurModel> getAllRecruteurs() {
        String sql = "SELECT * FROM recruteurs";
        List<RecruteurModel> recruteurs = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                RecruteurModel recruteur = new RecruteurModel(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getString("email"),
                        rs.getString("motDePasse"),
                        rs.getString("entreprise")
                );
                recruteurs.add(recruteur);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return recruteurs;
    }
}

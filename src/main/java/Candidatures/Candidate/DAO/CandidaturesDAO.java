package Candidatures.Candidate.DAO;


import jdk.internal.org.jline.reader.Candidate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO {
    private Connection connection;

    public CandidateDAO(Connection connection) {
        this.connection = connection;
    }

    // Ajouter un candidat
    public void addCandidate(Candidate candidate) throws SQLException {
        String sql = "INSERT INTO candidat (nom, email, telephone, cv) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, candidate.getNom());
        stmt.setString(2, candidate.getEmail());
        stmt.setString(3, candidate.getTelephone());
        stmt.setString(4, candidate.getCv());
        stmt.executeUpdate();
    }

    // Récupérer la liste des candidats
    public List<Candidate> getAllCandidates() throws SQLException {
        List<Candidate> candidates = new ArrayList<>();
        String sql = "SELECT * FROM candidat";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Candidate candidate = new Candidate(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("email"),
                    rs.getString("telephone"),
                    rs.getString("cv")
            );
            candidates.add(candidate);
        }
        return candidates;
    }
}


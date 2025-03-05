package Candidatures.Candidate.Servlet;



import Candidatures.Candidate.DAO.CandidateDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/CandidaturesServlet")
public class CandidateServlet {
    private Connection connection;
    private CandidateDAO candidateDAO;


    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/talentflow", "root", "root");
            candidateDAO = new CandidateDAO(connection);
        } catch (Exception e) {
            throw new ServletException("Erreur de connexion à la base de données", e);
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Candidate> candidates = candidateDAO.getAllCandidates();
            request.setAttribute("candidates", candidates);
            request.getRequestDispatcher("list-candidates.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException("Erreur lors de la récupération des candidats", e);
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String cv = request.getParameter("cv");

        Candidate candidate = new Candidate(0, nom, email, telephone, cv);
        try {
            candidateDAO.addCandidate(candidate);
            response.sendRedirect("CandidateServlet");
        } catch (SQLException e) {
            throw new ServletException("Erreur lors de l'ajout du candidat", e);
        }
    }


    public void destroy() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


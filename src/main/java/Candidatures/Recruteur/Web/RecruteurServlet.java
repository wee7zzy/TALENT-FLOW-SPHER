package Candidatures.Recruteur.Web;

import Candidatures.Recruteur.DAO.RecruteutDAO;
import Candidatures.Recruteur.Model.RecruteurModel;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/inscriptionRecruteur")
public class RecruteurServlet extends HttpServlet {
    private RecruteutDAO recruteurDAO = new RecruteutDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String email = request.getParameter("email");
        String motDePasse = request.getParameter("motDePasse");
        String entreprise = request.getParameter("entreprise");

        RecruteurModel recruteur = new RecruteurModel(0, nom, email, motDePasse, entreprise);
        recruteurDAO.ajouterRecruteur(recruteur);

        response.sendRedirect("success.jsp");
    }
}

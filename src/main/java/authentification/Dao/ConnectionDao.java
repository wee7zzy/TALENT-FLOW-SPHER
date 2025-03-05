package authentification.Dao;

import authentification.Model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConnectionDao {


    public class DatabaseConnection {
        private static final String URL = "jdbc:mysql://localhost:3306/TalentFlow?useSSL=false";
        private static final String USER = "root";
        private static final String PASSWORD = "root";



        public static Connection getConnection() {
            Connection connection = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return connection;
        }
        public void addUser(User user) throws SQLException {
            String query = "INSERT INTO users (name,  email,Mot_de_passe, role) VALUES (  ?, ?, ?, ?)";
            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, user.getName());
                stmt.setString(2, user.getEmail());
                stmt.setString(3, user.getPassword());
                stmt.setString(4, String.valueOf(user.getRole()));
                stmt.executeUpdate();
            }
        }
    }
}

package Utils;

<<<<<<< HEAD

=======
>>>>>>> b5adc0a5d09ca836ccf968120ee97c7f3ba8a2c2
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

<<<<<<< HEAD
    public class DBConnection {
        private static final String URL = "jdbc:mysql://127.0.0.1:3306/talentflow?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        private static final String USER = "root";
        private static final String PASSWORD = "root";

        public static Connection getConnection() throws SQLException {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL Driver
                return DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException e) {
                throw new SQLException(" MySQL JDBC Driver not found! Check your classpath.", e);
            }
        }
    }

=======
public class DBconnection {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/DoctorRV?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL Driver
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException(" MySQL JDBC Driver not found! Check your classpath.", e);
        }
    }
}
>>>>>>> b5adc0a5d09ca836ccf968120ee97c7f3ba8a2c2

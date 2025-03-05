package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDconnection {

    public class ConnectionDao {


        public class DatabaseConnection {
            private static final String URL = "jdbc:mysql://localhost:3306/TalentFlow?useSSL=false";
            private static final String USER = "root";
            private static final String PASSWORD = "root";



            public Connection getConnection() {
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

        }
    }

}

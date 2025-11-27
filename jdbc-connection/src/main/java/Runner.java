import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/servlets";
        String userName ="root";
        String password ="Root@1102";
        try {
            Connection connection=DriverManager.getConnection(url,userName,password);
            System.out.println("Connection : "+connection);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}

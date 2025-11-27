import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/servlets";
        String userName ="root";
        String password ="Root@1102";
        try {
            Connection connection=DriverManager.getConnection(url,userName,password);
            System.out.println("Connection : "+connection);
            String sql = "insert into matrimony values(2,'chandu@gmail.com','Groom','Male','2002-11-11','Telugu','Hindu','Unmarried',5.3),(3,'inchara@gmail.com','Bride','Female','2003-10-21','Kannada','Hindu','Unmarried',5.2);";
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Rows Affected : "+rowsAffected);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:prueba.sqlite3";

        try (Connection conn = DriverManager.getConnection(url)) {
            Statement stmt = conn.createStatement();

            String sql = "insert into alumnos (nombre, edad)" +
                    "values ('Pepito' 30)";
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
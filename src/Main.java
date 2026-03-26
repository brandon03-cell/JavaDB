import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:prueba.sqlite3";

        try (Connection conn = DriverManager.getConnection(url)) {
            Scanner sc = new Scanner(System.in);
            String nombreusuario = sc.nextLine();
            String sql = "insert into alumnos (nombre, edad)" +
                    "values (?, 0)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nombreusuario);
            pstmt.executeUpdate();
            /*while (rs.next()) {
                int id = rs.getInt("id_alumno");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                System.out.println(id + " " + nombre + " " + edad);
            }*/
            System.out.println("Todo correcto chaval");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
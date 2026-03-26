import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:prueba.sqlite3";

        try (Connection conn = DriverManager.getConnection(url)) {
            Statement stmt = conn.createStatement();
            String sql = "select * from alumnos where nombre like 'P%'";
            //stmt.execute(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                //int id = rs.getInt("id_alumno");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                System.out.println(nombre + " " + edad);
            }
            System.out.println("Todo correcto chaval");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
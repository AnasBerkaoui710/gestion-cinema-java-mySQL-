import java.sql.*;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "root";
        String password = "passwordOfServer";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("conected succefully");


            Scanner scanner = new Scanner(System.in);

            System.out.print("entrer le nom du film: ");
            String nomFilm = scanner.nextLine();

            System.out.print("entrer la duree du film: ");
            int duration = scanner.nextInt();
            scanner.nextLine();

            System.out.print("entrer la categorie du film(comedie,action...): ");
            String categorie = scanner.nextLine();

            String sql1 = "INSERT INTO film(titre, duree, categorie) VALUES(?, ?, ?)";
            PreparedStatement ps3 = conn.prepareStatement(sql1);

            System.out.println("Data inserted!");
            ps3.setString(1, nomFilm);
            ps3.setInt(2, duration);
            ps3.setString(3, categorie);


            ps3.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

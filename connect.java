import java.sql.*;

public class connect {

    public static void connect(){
        String url = "jdbc:mysql://dbta.1ez.xyz:3306/7_FinalProject";
        String user = "GAD8452";
        String password = "de1dus3r";

        Connection conn = null;

        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("connection is established");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}


import java.sql.*;
import java.util.Scanner;

public class newFnB {

    public String query1 = "INSERT INTO FnB (fnbName, price, size, category) VALUES (";

    private String values;

    public void setValues(String values) {
        this.values = values;
    }

    public String getValues(){
        return values;
    }

    public void inputValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a values: ");
        setValues(sc.nextLine());
    }

    public String query = query1 + values + ");";

    public void connect() {
        String url = "jdbc:mysql://dbta.1ez.xyz:3306/7_FinalProject";
        String user = "GAD8452";
        String password = "de1dus3r";

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("connection is established");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {
            Statement s = conn.createStatement();
            try {
                ResultSet rs = s.executeQuery(query);
                try {
                    while (rs.next()) ;
                } finally {
                    try {
                        rs.close();
                    } catch (Throwable ignore) {
                    }

                }finally{
                    try {
                        s.close();
                    } catch (Throwable ignore) {
                    }
                }finally{
                    try {
                        conn.close();
                    } catch (Throwable ignore) {
                    }
                }
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
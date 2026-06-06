import  java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws  Exception {
        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the result
            close
         */
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "achyutp10";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");
    }
}

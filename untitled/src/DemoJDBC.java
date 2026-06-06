//import javax.swing.plaf.nimbus.State;
//import  java.sql.*;
//
//public class DemoJDBC {
//    public static void main(String[] args) throws  Exception {
//        /*
//            import package
//            load and register
//            create connection
//            create statement
//            execute statement
//            process the result
//            close
//         */
//        String url = "jdbc:postgresql://localhost:5432/demo";
//        String uname = "postgres";
//        String pass = "achyutp10";
//        String sql = "select sname from student where sid = 5";
//
//        Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection Established");
//
//
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);
//        if (rs.next()) {
//            String name = rs.getString("sname");
//            System.out.println("Name of Student is: "+name);
//        }
//
//        con.close();
//        System.out.println("Connection closed");
//
//
//    }
//}

import javax.swing.plaf.nimbus.State;
import  java.sql.*;
import java.util.ArrayList;

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
        String sql = "select * from student";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");


        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList arr = new ArrayList();
        while (rs.next()) {
            System.out.print(rs.getInt(1)+ " - ");
            System.out.print(rs.getInt(2)+ " - ");
            System.out.println(rs.getString(3));

        }


        con.close();
        System.out.println("Connection closed");


    }
}


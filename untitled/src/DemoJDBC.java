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
//import  java.sql.*;
//import java.util.ArrayList;
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
//        String sql = "select * from student";
//
//        Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection Established");
//
//
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);
//        ArrayList arr = new ArrayList();
//        while (rs.next()) {
//            System.out.print(rs.getInt(1)+ " - ");
//            System.out.print(rs.getInt(2)+ " - ");
//            System.out.println(rs.getString(3));
//
//        }
//
//
//        con.close();
//        System.out.println("Connection closed");
//
//
//    }
//}

//
//import  java.sql.*;
//import java.util.ArrayList;
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
//        String sql = "Insert into student(sid, sname, marks) values (22, 'John', 55)";
//
//        Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection Established");
//
//
//        Statement st = con.createStatement();
//        boolean result = st.execute(sql);
//        if (result) {
//            System.out.println("Data inserted");
//        } else {
//            System.out.println("Data not inserted");
//
//        }
//
//
//
//        con.close();
//        System.out.println("Connection closed");
//
//
//    }
//}



//
//import  java.sql.*;
//import java.util.ArrayList;
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
//        String sql = "Update student set sname='Max' where sid = 22";
//
//        Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection Established");
//
//
//        Statement st = con.createStatement();
//        boolean result = st.execute(sql);
//        if (result) {
//            System.out.println("Data updated");
//        } else {
//            System.out.println("Data not updated");
//
//        }
//
//
//
//        con.close();
//        System.out.println("Connection closed");
//
//
//    }
//}

////
//import  java.sql.*;
//import java.util.ArrayList;
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
//        String sql = "delete from student where sid = 22";
//
//        Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection Established");
//
//
//        Statement st = con.createStatement();
//        boolean result = st.execute(sql);
//        if (result) {
//            System.out.println("Data deleted");
//        } else {
//            System.out.println("Data not deleted");
//
//        }
//
//
//
//        con.close();
//        System.out.println("Connection closed");
//
//
//    }
//}


// Prepared statement

import  java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sid: ");
        int sid = (int) (sc.nextInt());
        sc.nextLine();
        System.out.println("Enter sname: ");
        String sname = sc.nextLine();
        System.out.println("Enter Marks: ");
        int marks = (int) (sc.nextInt());
        sc.nextLine();

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "achyutp10";
        String sql = "Insert into student values(?,?,?)";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");


        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, sid);
        ps.setInt(2, marks);
        ps.setString(3, sname);

        boolean result = ps.execute();
        if (result) {
            System.out.println("Data inserted");
        } else {
            System.out.println("Data not inserted");

        }



        con.close();
        System.out.println("Connection closed");


    }
}
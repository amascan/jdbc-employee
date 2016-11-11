import dao.User;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public class Driver {
    public static void main(String[] args) {
        List<User> useri = new ArrayList<>();

        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "ady4ever");

            Statement myStmt = myConn.createStatement();

            ResultSet myRs = myStmt.executeQuery("select * from employees");

            while (myRs.next()) {
              //  System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name") + ", " + myRs.getString("email") + ", " + myRs.getString("venit"));
                User user = new User(myRs.getString("last_name"), myRs.getString("first_name"), myRs.getString("email"), myRs.getDouble("venit"));
                useri.add(user);
            }


        } catch (Exception exc) {
            exc.printStackTrace();
        }
        Double mediaVenituri;
        Double totalVenituri = 0d;

        for (User u : useri) {
            System.out.println(u);
            totalVenituri = totalVenituri + u.getVenit();

        }
        System.out.println("Media venituri= " + totalVenituri/ useri.size());
    }
}

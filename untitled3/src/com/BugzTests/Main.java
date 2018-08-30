package com.BugzTests;

import java.
public class Main {
    static final String URL = "jdbc:mysql://localhost:3306/school_portal";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void makeConnection() {
        try

        {
            Class.forName("com.mysql.jdbc.driver");
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "select * from students";
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery(query);
            while (re.next()) {
                System.out.println(re.next());
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        // read(0)
        //edit();
    }

    public static void main(String[] args) {
	// write your code here

        Main.makeConnection();
    }
}

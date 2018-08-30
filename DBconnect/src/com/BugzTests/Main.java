package com.BugzTests;

import java.sql.*;
public class Main {
    static final String URL = "jdbc:mysql://localhost:3306/school_portal";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void makeConnection() {
        try

        {
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "insert into students values(32,\"new\",\"new\",\"new\")";
            Statement st = con.createStatement();

            System.out.println(st.executeUpdate(query));

        } catch (SQLException e) {
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

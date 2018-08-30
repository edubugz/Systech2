package com.BugzTests;


import java.sql.*;

public class DBlogic {

    private final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/student_login";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static Connection dbConnection  = getDBConnection();


    //establish connection

    public static Connection getDBConnection() {

        Connection con=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    DB_CONNECTION, DB_USER, DB_PASSWORD);
            System.out.println("done");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        catch (ClassNotFoundException e)
        {

        }
        catch (Exception e)
        {

        }

        if( con == null)
        {
            System.out.println("sorry");
        }
        return con;

    }





    public String insertStudent(String username, String password)
    {

        String responseString="";


        // prepared statement for student and guardian
        String updateString = String.format("insert into student values(\"%s\",\"%s\"",username,password);

        try {
            Statement queryToExecute = dbConnection.createStatement();
            if (queryToExecute.execute(updateString)) {
                dbConnection.commit();
                responseString = "successful in registering";
            } else {
                //if it fails, roll back
                dbConnection.rollback();
                responseString = "failed to register";
            }
        }

        catch (Exception e){ e.printStackTrace();}

        return responseString;



    }


    public int readFromDB(String username,String password) throws SQLException {

        String readStudentFromDBSQL = String.format("SELECT * FROM STUDENT WHERE id =\"%S\" AND name =\"%s\" ",username,password);
        Statement queryToExecute = dbConnection.createStatement();
        ResultSet studentsData = queryToExecute.executeQuery(readStudentFromDBSQL);

        // if the result set has any data assign the data to strings and print it
        if (studentsData.next())
        {

            //the statement used as the condition in the if statement --> studentsData.next()
            // moves the cursor to the next result set.
            //students.beforeFirst returns the cursor to the start of the result set.

            studentsData.beforeFirst();

            String id = studentsData.getString("id");
            String name = studentsData.getString("name");

            System.out.println(" login successful \n" + "student admission: " + id + "\nstudent name: " + name);


        }

        System.out.println("student not found in the database, please signup to gain access");

        return 0;
    }




}












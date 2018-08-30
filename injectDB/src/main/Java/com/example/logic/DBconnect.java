package com.example.logic;

import com.example.model.Student;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RequestScoped
public class DBconnect implements Serializable {

    private final String URL="jdbc:mysql://localhost:3306/stude";
    private final String USER="root";
    private final String PASS ="";
    private final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";


    @Produces
    @RequestScoped
     Connection con;


    public  Connection initiateConnection()
    {

        try
        {
            Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(URL,USER,PASS);
            if(con != null)
            {
                System.out.println("con given out");
                return con;
            }

        }

        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

        return con;

    }

}

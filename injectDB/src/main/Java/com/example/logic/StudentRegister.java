package com.example.logic;

import com.example.interfaces.StudentI;
import com.example.model.Staff;
import com.example.model.Student;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RequestScoped
public class StudentRegister implements StudentI,Serializable
{


    @Inject DBconnect toDB;

    @Inject Connection con;

    public Boolean passValues(String name, String id)
    {
        Student s1 = new Student(name,id);

       Boolean isSuccessful= register(s1);

       return isSuccessful;

    }



    @Override
    public boolean register(Student e)
    {

        con = toDB.initiateConnection();


        try
        {
            con.setAutoCommit(false);
            System.out.println( con.getMetaData());

            String query = "INSERT INTO student VALUES(?,?)";

            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1,e.getName());
            stm.setString(2,e.getId());
           int status = stm.executeUpdate();
            System.out.println(status);

            if(status>0)
            {
                System.out.println("write successful");
                con.commit();
                con.close();
                return true;
            }
            else
            {
                System.out.println("write failed");
                con.rollback();
                con.close();
            }


        }

        catch (SQLException s)
        {
            System.out.println(s.getMessage());
            return  false;
        }


       return false;

    }




}

package com.example.servlet;

import com.example.logic.DBconnect;
import com.example.logic.StudentRegister;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", urlPatterns = "RegisterStudent")
public class RegisterServlet extends HttpServlet {

    @Inject
    DBconnect toDB;

    @Inject
    StudentRegister newStudent;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        String name = request.getParameter("name");
        String id =  request.getParameter("id");
        session.setAttribute("name",name);
        session.setAttribute("id",id);

        boolean isIn = newStudent.passValues(name,id);
        PrintWriter out=null;

        try
        {
            out = response.getWriter();
            if(isIn)
            {
                out.write("student added");

            }
            else
            {

                out.write("not successful");
            }
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());

        }

        finally {
            out.close();
        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

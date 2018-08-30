package com.example.com.example.servlets;

import com.example.com.example.logic.Greeting;
import com.example.com.example.logic.Heloo;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SalamuServlet",urlPatterns = "salamu")
public class SalamuServlet extends HttpServlet {

    @Inject
    @Named("kale")
    public Heloo kale;

    @Inject
    @Named("kuyu")
    public Heloo kuyu;

    @Inject
    @Named("mathai")
    public Heloo mathai;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String greeting = request.getParameter("name");

        if(greeting.equals("kale"))
        {
            out.write(kale.sayHeloo());
        }

        else if(greeting.equals("kuyu"))
        {
            out.write(kuyu.sayHeloo());
        }
        else if(greeting.equals("mathai"))
        {
            out.write(mathai.sayHeloo());
        }

    }

}

package com.evander.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Annotation to let the IDE knows that this class is for somthing
//We use the @ mark as we told the java wait this is a NB or Note
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
//HttpServlet is an interface that implements some methods to be used with servlet created
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // This is to print into the browser
       /* PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Login Form</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Login Form</h2>");
        out.println("<p>toto</p>");
        out.println("</body>");
        out.println("</html>");*/
    	request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    // Override doPost if you want to handle POST requests
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests if needed
    }
}

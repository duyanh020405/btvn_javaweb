package com.data.ss01_bt;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bt3", value = "/bt3")
public class bt3 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String name = "Duy Anh" ;
        int age = 20 ;

        request.setAttribute("name", name);
        request.setAttribute("age", age);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/bt3.jsp");
        rd.forward(request , response);
    }

    public void destroy() {
    }
}
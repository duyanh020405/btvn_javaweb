package com.data.ss01_bt;import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bt1", value = "/bt1")
public class bt1 extends HttpServlet {
    private String message;

    public void init() {
        message = "Bt1";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        out.println("Client (Browser) --> Web Server --> Application Server --> Database Server\n");
        out.println("</br>");
        out.println("</br>");
        out.println("Client (Browser): Gui yeu cau HTTP va hien thi ket qua tra ve tu server.");
        out.println("</br>");
        out.println("Web Server: Nhan va phan tich yeu cau, xu ly tai nguyen tinh hoac chuyen tiep den Application Server.");
        out.println("</br>");
        out.println("Application Server: Xu ly logic nghiep vu va tuong tac voi co so du lieu.");
        out.println("</br>");
        out.println("Database Server: Luu tru va truy van du lieu.");
        out.println("<button onclick=\"location.href='/ss01_bt_war_exploded'\">Return</button>");


    }

    public void destroy() {
    }
}
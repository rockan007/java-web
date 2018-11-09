package com.lostbug.hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiValueParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer=resp.getWriter();
        writer.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("   <head>\r\n")
                .append("       <title>Hello User Application</title>\r\n")
                .append("   </head>\r\n")
                .append("   <body>\r\n")
                .append("       <form action=\"checkboxes\" method=\"POST\">\r\n")
                .append("           Select the fruits you like to eat:")
                .append("           <input type=\"checkbox\" name=\"fruit\" value=\"Banana\" />")
                .append("           Banana<br/>\r\n")
                .append("           <input type=\"checkbox\" name=\"fruit\" value=\"Apple\"/>")
                .append("           Apple<br/>\r\n")
                .append("           <input type=\"checkbox\" name=\"fruit\" value=\"Orange\"/>")
                .append("           Orange<br/>\r\n")
                .append("           <input type=\"checkbox\" name=\"fruit\" value=\"Guava\"/>")
                .append("           Guava<br/>\r\n")
                .append("           <input type=\"checkbox\" name=\"fruit\" value=\"Kiwi\"")
                .append("           Kiwi<br/>\r\n")
                .append("           <input type=\"submit\" value=\"Submit\"/>\r\n")
                .append("       </form>")
                .append("   </body>\r\n")
                .append("</html>\r\n");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] fruits=req.getParameterValues("fruit");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
    }
}

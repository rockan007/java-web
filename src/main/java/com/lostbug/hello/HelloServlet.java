package com.lostbug.hello;

import javax.servlet.ServletException;
import java.io.IOException;

public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().println("Hello,World!");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().println("Hello,World!");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }
}

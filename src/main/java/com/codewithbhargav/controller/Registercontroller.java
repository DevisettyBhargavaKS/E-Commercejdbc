package com.codewithbhargav.controller;

import com.codewithbhargav.dao.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Registercontroller extends HttpServlet {
    private UserDao userDao;
    public Registercontroller(){userDao=new UserDao();}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        userDao.register(username,password);
        RequestDispatcher rs=req.getRequestDispatcher("index.jsp");
        rs.forward(req,resp);

    }
}

package com.codewithbhargav.controller;

import com.codewithbhargav.dao.ProductDao;
import com.codewithbhargav.dao.UserDao;
import com.codewithbhargav.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class Homecontroller extends HttpServlet {
    private ProductDao productDao;
    private UserDao userDao;
    public Homecontroller(){
        userDao=new UserDao();
        productDao=new ProductDao();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productid=req.getParameter("id");
        HttpSession httpSession= req.getSession();
        int userloggedin=(int) httpSession.getAttribute("id");
        if (productid !=null){
            productDao.addProduct(Integer.parseInt(productid),userloggedin);

        }
        doPost(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher= req.getRequestDispatcher("home.jsp");
        int userid=Integer.parseInt(req.getSession().getAttribute("id").toString());
        List<Product>products=productDao.selectAllProducts();
        req.setAttribute("Products",products);
        dispatcher.forward(req,resp);


    }
}

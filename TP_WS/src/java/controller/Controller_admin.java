/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.Service_admin;

/**
 *
 * @author Tiavina Ravaka
 */
public class Controller_admin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Service_admin service=new Service_admin();
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
                String login=request.getParameter("login");
                String mdp=request.getParameter("mdp");
                
                if(service.valider(login,mdp)==true){
                    RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
                     rd.forward(request,response);
                }
                else{ 
                    RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
                     rd.forward(request,response);
                }
            }
            catch(Exception e){
                e.printStackTrace(response.getWriter());
            }
    }
}

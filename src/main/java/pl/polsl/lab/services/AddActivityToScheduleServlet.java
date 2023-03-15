/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pl.polsl.lab.services;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import pl.polsl.lab.model.Schedule;

/**
 *
 * @author Dominik Matysek
 * @version 1.0
 */
@WebServlet("/addActivity")
public class AddActivityToScheduleServlet extends HttpServlet {
    
    private Schedule sch;
    
    @Override
    public void init() 
    {
        sch = (Schedule) getServletContext().getAttribute("sch");
        if(sch == null)
        {
            getServletContext().setAttribute("sch", new Schedule());
            sch = (Schedule) getServletContext().getAttribute("sch");
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
        
        String activityName = request.getParameter("activityName");
        int year = Integer.parseInt(request.getParameter("year"));
        int month = Integer.parseInt(request.getParameter("month"));
        int day = Integer.parseInt(request.getParameter("day"));
        String registrationNumber = request.getParameter("registration_number");
        String vehicleModel = request.getParameter("model");
        int vehicleProductionYear = Integer.parseInt(request.getParameter("production_year"));
        String clientName = request.getParameter("name");
        String clientSurname = request.getParameter("surname");
        int clientPhoneNumber = Integer.parseInt(request.getParameter("phone_number"));
        String clientAddress = request.getParameter("address");
       
        sch.addData(activityName, year, month, day, registrationNumber, 
                vehicleModel, vehicleProductionYear, clientName, clientSurname, clientPhoneNumber, clientAddress);
        
        Cookie cookie = new Cookie("lastAddedActivity", activityName);
        response.addCookie(cookie);
        
        out.println("""
                    <head>
                            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                            <link rel="stylesheet" href="css/main.css"> 
                            <title>Add activity</title>
                            <script type="text/javascript" src="js/ajax.js"></script> 
                    
                        </head>""");
        out.println("""
                    <body>
                            <nav class = "navigation-bar"> 
                            <a href="/Matysek.Dominik.cw4.prototyp/schedule.html"><button>Back to schedule</button></a> 
                            </nav> 

                            <h1>New activity was added to schedule!</h1> 
                            </body>
                    </html>""");
    }
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @retu
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>rn a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

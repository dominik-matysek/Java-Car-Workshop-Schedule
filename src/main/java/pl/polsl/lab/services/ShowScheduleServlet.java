/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.lab.services;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import pl.polsl.lab.model.Activity;
import pl.polsl.lab.model.Date;
import pl.polsl.lab.model.Owner;
import pl.polsl.lab.model.Schedule;
import pl.polsl.lab.model.Vehicle;

/**
 *
 * @author Dominik Matysek
 * @version 1.0
 */
@WebServlet("/showSchedule")
public class ShowScheduleServlet extends HttpServlet 
{
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
        String activityName = request.getParameter("activityName"); 
       
        boolean showAll = activityName == null || activityName.length() == 0;
        
          PrintWriter out = response.getWriter();        
        for(Activity a : sch.getActivities())
        {
            if(showAll || a.getActName().contains(activityName))
            {
                out.println("<tr>");
                out.println("<td>");
                out.println(a.getActName());
                out.println("</td>");
                
                for(Date d: a.getDates())
                {
                    out.println("<td>");
                    out.println(d.getYear() + "." 
                    + d.getMonth() + "." + d.getDay());
                    out.println("</td>");            
                    
                    for(Vehicle v: d.getVehicles())
                    {
                        // Printing clients
                        for(Owner o: v.getOwners())
                        {
                            out.println("<td>");
                            out.println(o.getName());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(o.getSurname());
                            out.println("</td>");
                            out.println("<td>");
                            out.println("+48 " + o.getPhoneNumber());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(o.getAddress());
                            out.println("</td>");

                        }
                            
                        out.println("<td>");
                        out.println(v.getModel()); 
                        out.println("</td>");
                        out.println("<td>");
                        out.println(v.getProductionYear()); 
                        out.println("</td>");
                        out.println("<td>");
                        out.println(v.getRegistrationNumber());
                        out.println("</td>");
                        out.println("</tr>");  
                    }
                }
            }
        }        
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

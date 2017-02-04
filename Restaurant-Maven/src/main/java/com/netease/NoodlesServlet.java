package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;   
import org.apache.log4j.PropertyConfigurator;

public class NoodlesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        String vegetable = request.getParameter("vegetable");
        if (vegetable == null) {
            vegetable = "Tomato";
        }

        writer.println("<html><body>");
        writer.println("<h1> Noodles with " + vegetable + "</h1>"); 
        writer.println("</body></html>");
    }
	
	public static void main(String[] args) {   
		 //Get an instance of the myLogger   
		 Logger myLogger = Logger.getLogger("myLogger");   
		  
		 //Get an instance of the childLogger   
		 Logger mySonLogger = Logger.getLogger("myLogger.mySonLogger");   
		 //Load the proerties using the PropertyConfigurator   
		 PropertyConfigurator.configure("log4j.properties");   
	  
		 //Log Messages using the Parent Logger   
		 myLogger.debug("Thie is a log message from the " + myLogger.getName());   
		 myLogger.info("Thie is a log message from the " + myLogger.getName());   
		 myLogger.warn("Thie is a log message from the " +  myLogger.getName());   
		 myLogger.error("Thie is a log message from the " + myLogger.getName());   
		 myLogger.fatal("Thie is a log message from the " + myLogger.getName());   
	  
		 mySonLogger.debug("Thie is a log message from the " + mySonLogger.getName());   
		 mySonLogger.info("Thie is a log message from the " + mySonLogger.getName());   
		 mySonLogger.warn("Thie is a log message from the " +  mySonLogger.getName());   
		 mySonLogger.error("Thie is a log message from the " + mySonLogger.getName());   
		 mySonLogger.fatal("Thie is a log message from the " + mySonLogger.getName());   
   }   
}

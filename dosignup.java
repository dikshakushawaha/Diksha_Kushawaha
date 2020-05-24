package Doc;
import javax.swing.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.dosignupdao;



public class dosignup extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
     dosignupdao dao1=new dosignupdao();
     if(dao1.check(email, username, password))
     {
    	 response.sendRedirect("login.html");
    	 
     }
     else
     {
    	 response.sendRedirect("error.html");
     }
	
			
			
		
		
	}

	

}


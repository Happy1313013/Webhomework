

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import WebChat.User;
import WebChat.UserManager;
import WebChat.UserManagerImpl;

/**
 * Servlet implementation class addm
 */
@WebServlet("/addm")
public class addm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doPost(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");  
        response.setCharacterEncoding("utf-8");  
          
        String un = request.getParameter("username");  
        String pswd = request.getParameter("pwd"); 
        String s1 ="wyh";
        String s2 ="sl";
        String s3 ="lxw";
          
        UserManager um = new UserManagerImpl();  
         boolean flag= false; 
         try {  
             flag = um.addm(un, pswd);  
              
        } catch (Exception e) {   
            e.printStackTrace();  
        }  
         while(flag){  
             if(un.equals(s1)){response.sendRedirect("wyh.jsp"); return;}
             else if(un.equals(s2)){response.sendRedirect("sl.jsp"); return;}
             else if(un.equals(s3)){response.sendRedirect("lxw.jsp");return;}
             else {
            	 response.sendRedirect("c.html");
            	 return;
             }
         }
         if(flag==false){
        	response.sendRedirect("login.jsp");
         }
	}

}



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
 * Servlet implementation class add
 */
@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doPost(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");  
        response.setCharacterEncoding("utf-8");  
          
        String username = (request.getParameter("username"));  
        String pswd = request.getParameter("password");  
        String id = request.getParameter("id");  
        UserManager um =new  UserManagerImpl();  
        User u = new  User();  
          
        u.setUsername(username);  
        u.setPassword(pswd);  
        u.setId(id);  
          
        boolean flag= false;
        try {  
            flag = um.add(u);  
            if(flag==true){  
                response.sendRedirect("login.jsp");  
            }  
              
        } catch (Exception e) {  
            
            e.printStackTrace();  
        }  
	}

}

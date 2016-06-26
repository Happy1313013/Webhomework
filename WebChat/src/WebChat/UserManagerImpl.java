package WebChat;

import java.sql.*;

public class UserManagerImpl implements UserManager {

	@Override
	public boolean add(User u) {
		// TODO Auto-generated method stub
		boolean flag = false;  
        Connection conn = null;  
        PreparedStatement pst = null;       
        try {  
        	Class.forName("com.mysql.jdbc.Driver");
        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat","root" ,"wang137");
            String sql = "insert into chatuser (username,password,id) value(?,?,?)";  
            pst =conn.prepareStatement(sql);  
            pst.setString(1, u.getUsername());  
            pst.setString(2, u.getPassword());  
            pst.setString(3, u.getId());  
              
            int rows = pst.executeUpdate();  
            if(rows>0){  
                flag= true;  
            }  
              
        } catch (Exception e) {  
             
            e.printStackTrace();  
        }finally{  
            ChatDatabase.close(pst, conn);  
        }  
          
          
        return flag;  
	}

	@Override
	public boolean addm(String username, String password) {
		// TODO Auto-generated method stub
		boolean flag = false;  
        Connection conn = null;  
        Statement st = null;  
        ResultSet rs = null;  
        try {  
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/chat", "root","wang137");
            String sql = "select * from chatuser where username = '"+username+"'";
            st =(Statement)conn.createStatement();
            rs =(ResultSet)st.executeQuery(sql);
            while(rs.next()){  
                if (rs.getString("password").equals(password)){  
                    flag = true;  
                }  
            }  
              
              
        } catch (Exception e) {  
             
            e.printStackTrace();  
        }finally{  
           ChatDatabase.close((java.sql.Statement) st, rs, conn);  
        }  
          
          
        return flag;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

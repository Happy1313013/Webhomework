
package WebChat;

import java.sql.*;

public class ChatDatabase
{
	protected final static String DATABASE_NAME = "jdbc:mysql://localhost:3306/chat";
	
	protected static Connection connection=null;	//为数据库建立的连接
	protected static Statement statement=null;		//将执行的SQL语句
	
	public ChatDatabase()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			}
			//加载数据库驱动
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getconnection(){
		try{
			connection=(Connection)DriverManager.getConnection(DATABASE_NAME,"root","wang137");
		}//加载到chat数据库
		catch(Exception e){
			e.printStackTrace();
		}
		return connection;
	}
	public static void close(Statement sta,ResultSet rs,Connection conn){
		try{
			if(sta!=null){
				sta.close();
			}
			if(rs!=null){
				rs.close();
			}
			if(conn!=null){
				conn.close();
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	public static void close(PreparedStatement pst, Connection conn){  
        
        try {  
              
            if(pst!=null){  
                pst.close();  
            }  
            if(conn!=null){  
                conn.close();  
            }  
              
        } catch (Exception e) {    
            e.printStackTrace();  
        }  
          
    }  
}

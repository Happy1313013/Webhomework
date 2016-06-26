
package WebChat;

import java.sql.*;

public class ChatDatabase
{
	protected final static String DATABASE_NAME = "jdbc:mysql://localhost:3306/chat";
	
	protected static Connection connection=null;	//Ϊ���ݿ⽨��������
	protected static Statement statement=null;		//��ִ�е�SQL���
	
	public ChatDatabase()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			}
			//�������ݿ�����
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getconnection(){
		try{
			connection=(Connection)DriverManager.getConnection(DATABASE_NAME,"root","wang137");
		}//���ص�chat���ݿ�
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

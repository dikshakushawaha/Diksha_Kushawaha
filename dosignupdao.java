package dao;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

	public class dosignupdao {

		
		String sql="insert into userinfo values(?,?,?) ";
		String url="jdbc:mysql://localhost:3306/usersdata";
		String uname="root";
		String pass="Diksha1999@";
		
		 public boolean check(String email,String username ,String password )
		 {
			 
			 try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,uname,pass);
				PreparedStatement st=con.prepareStatement(sql);
				st.setString(1, email);
				st.setString(2,username );
				st.setString(3, password);
				int count=st.executeUpdate();
			System.out.print("fbje"+count);
				
				if(count!=0)
				{
					System.out.print("success");
					return true;
				}
			
			
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			 
			return false; 
		
		 }
		
	}



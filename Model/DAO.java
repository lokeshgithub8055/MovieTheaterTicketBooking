package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.TheaterController;

public class DAO {
	static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ieja8?user=root&password=sql123");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	PreparedStatement pstmt;
	 int booked_ticket=0;
	int price=0;
	int billamt=0;
	int gst=0;
	int updated_ticket=0;
	int availableticket;
	public int displayTheater(String movieName,int noofticket)
	{   
		
		
		ResultSet rs;
		TheaterController tc= new TheaterController();
		String query="select * from theater where movie_name=?";
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, movieName);;
		    rs=pstmt.executeQuery();
		    
		    
			while(rs.next())
			{
				availableticket=rs.getInt(4);
				price=rs.getInt(5);
				
			if(noofticket<=availableticket)
				{
				   billamt=price*noofticket;
				   gst=(int) (billamt+billamt*0.18);
  System.out.println("Bill amount is"+billamt);
				   System.out.println("gst"+gst);
				   updated_ticket=availableticket-noofticket;
				   
				   String query1="update theater set no_of_ticket_avail="+updated_ticket+" where movie_name='"+movieName+"'";
				   pstmt=con.prepareStatement(query1);
				   pstmt.executeUpdate(query1);
				   
				   }
			else {
				billamt=0;
			     }
				
				
			 
				  }
			
			
		} 
		
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
}
		return gst;
		}
	
}
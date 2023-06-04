package Controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.DAO;
@WebServlet("/movielink")
public class TheaterController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String moviename=req.getParameter("movie");
		int ticket=Integer.parseInt(req.getParameter("noofticket"));
		
		
		DAO d= new DAO();
		double total=d.displayTheater(moviename, ticket);
     	req.setAttribute("TotalBill", total);
     	System.out.println(total);
     	
		RequestDispatcher rd= req.getRequestDispatcher("mv.jsp");
		rd.forward(req,resp);
		
	}

}

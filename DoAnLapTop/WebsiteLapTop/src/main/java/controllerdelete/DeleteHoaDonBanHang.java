package controllerdelete;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAONHANVIEN;

@WebServlet("/DeleteHoaDonBanHang")
public class DeleteHoaDonBanHang extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int maHDBH = Integer.parseInt(request.getParameter("id"));
		DAONHANVIEN dao = new DAONHANVIEN();
		dao.deleteHoaDonBanHang(maHDBH);
		response.sendRedirect("HoaDonBanHangDB");
	}

}
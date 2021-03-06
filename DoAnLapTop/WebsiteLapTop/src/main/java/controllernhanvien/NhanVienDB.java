package controllernhanvien;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import dao.DAONHANVIEN;
import model.GioHang;
import model.HoaDonBanHang;
import model.NhanVien;

@WebServlet("/NhanVienDB")
public class NhanVienDB extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		DAONHANVIEN dao = new DAONHANVIEN();
		
		List<NhanVien> list = dao.getAllNhanVien();
		
		String start = request.getParameter("start");
		if (start == null) {
			start = "0";
		}
		int end = list.size();
		request.setAttribute("start", start);
		request.setAttribute("end", end);
		request.setAttribute("listNhanVien", list);
		
		request.getRequestDispatcher("/viewsnhanvien/NhanVienDB.jsp").forward(request, response);
	}

}

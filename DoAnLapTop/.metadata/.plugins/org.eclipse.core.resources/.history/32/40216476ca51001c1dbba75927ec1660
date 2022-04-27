package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;


import model.SanPham;

@WebServlet("/GioHangServlet")
public class GioHangServlet extends HttpServlet {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String maSP = request.getParameter("maSP");
		SanPham listChiTietSanPham = new SanPham();
		DAO dao = new DAO();

		listChiTietSanPham = dao.getSanPham(maSP);
		dao.insertGioHang(listChiTietSanPham.getMaSP(), listChiTietSanPham.getTenSP(), listChiTietSanPham.getGiaSP());
		response.sendRedirect("ShowGioHangServlet");

	}

}

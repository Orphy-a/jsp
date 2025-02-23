package controller.user4;

import java.io.IOException;

import dto.User4DTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.User4Service;

@WebServlet("/user4/modify.do")
public class ModifyController extends HttpServlet {


	private static final long serialVersionUID = 1L;
	
	User4Service service = User4Service.INSTANCE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 데이터 수신
		String prod_no = req.getParameter("prod_no");
		
		// 수정 데이터 조회
		User4DTO dto = service.findUser4(prod_no);
		
		// 데이터 forward와 공유
		req.setAttribute("dto", dto);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/user4/modify.jsp");
		dispatcher.forward(req, resp);
		
		
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String prod_no = req.getParameter("prod_no");
		String prod_name = req.getParameter("prod_name");
		String prod_price = req.getParameter("prod_price");
		String prod_stock = req.getParameter("prod_stock");
		String prod_company = req.getParameter("prod_company");
		String prod_date = req.getParameter("prod_date");
	
		User4DTO dto = new User4DTO();
		
		dto.setProd_no(prod_no);
		dto.setProd_name(prod_name);
		dto.setProd_price(prod_price);
		dto.setProd_stock(prod_stock);
		dto.setProd_company(prod_company);
		dto.setProd_date(prod_date);
		
		service.modifyUser4(dto);
		
		resp.sendRedirect("/ch10/user4/list.do");
		
		
	
	}
	
	
}

package controller.customer;

import java.io.IOException;

import DTO.CustomerDTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CustomerService;

@WebServlet("/shop/customer/register.do")
public class RegisterContoller extends HttpServlet {
	private static final long serialVersionUID = 5600830193993851734L;

	private CustomerService service = CustomerService.INSTANCE;
	
	// 로거생성
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		logger.trace("registerController logger trace...");
		logger.debug("registerController logger debug...");
		logger.info("registerController logger info...");
		logger.warn("registerController logger warn...");
		logger.error("registerController logger error...");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/shop/customer/register.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String custId = req.getParameter("custId");
		String name = req.getParameter("name");
		String hp = req.getParameter("hp");
		String addr = req.getParameter("addr");
		
		CustomerDTO dto = new CustomerDTO();
		dto.setCustid(custId);
		dto.setName(name);
		dto.setHp(hp);
		dto.setAddr(addr);
		
		service.registerCustomer(dto);
		
		resp.sendRedirect("/ch11/shop/customer/register.do");		
	}	
}
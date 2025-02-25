package kr.co.jboard.controller.article;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.jboard.dto.ArticleDTO;
import kr.co.jboard.dto.PageGroupDTO;
import kr.co.jboard.service.ArticleService;

@WebServlet("/article/list.do")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1271262765653325736L;
	
	private ArticleService service = ArticleService.INSTANCE;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
				
		
		// 글목록 데이터 조회
		List<ArticleDTO> articles = service.findAllArticle();
				
		// 데이터 참조 공유
		req.setAttribute("articles", articles);

		// View forward
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/article/list.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}

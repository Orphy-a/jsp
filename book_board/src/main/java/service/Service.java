package service;

import VO.BoardVO;
import dao.BoardDAO;

public enum Service {
	
	INSTANCE;
	private BoardDAO dao = BoardDAO.getinstance();
	
	public void insert(BoardVO vo) {
		return dao.insertBoard(vo);
	}
	
	public void update(BoardVO vo) {
		return dao.updateBoard(vo);
	}
	
	public void delete(BoardVO vo) {
		return dao.deleteBoard(vo);
	}
	public void select(BoardVO vo) {
		return dao.selectBoard(0);
	}
	public void delete(BoardVO vo) {
		return dao.selectAllBoard();
	}
	
	
	
	
	
	
}

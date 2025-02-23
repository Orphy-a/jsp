package service;

import java.util.List;

import dao.User3DAO;
import dto.User3DTO;


public enum User3Service {
	
	// 싱글턴
	INSTANCE;
	
	// DAO 호출
	private User3DAO dao = User3DAO.getInstance();	
		
	public void registerUser3(User3DTO dto) {
		dao.insert_user3(dto);
	}
	
	public User3DTO findUser3(String uid) {
		return dao.select_user3(uid);
	}
	
	public List<User3DTO> findAllUser3() {
		return dao.select_all_user3();
	}
	
	public void modifyUser3(User3DTO dto) {
		dao.update_user3(dto);
	}
	
	public void removeUser3(String uid) {
		dao.delete_user3(uid);
	}
	
	
}

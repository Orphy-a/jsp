package service;

import java.util.List;

import dao.User1DAO;
import dao.User2DAO;
import dto.User1DTO;
import dto.User2DTO;

public class User2Service {

	private static final User2Service INSTANCE = new User2Service();
	
	public static User2Service getInstance() {
		return INSTANCE;
	}
	private User2Service() {}
	
	
	// DAO 호출
	private User2DAO dao = User2DAO.getInstance();
	
	public void registeruser2(User2DTO dto) {
		dao.insert_user2(dto);
	}
	
	public User2DTO finduser2(String uid) {
		return dao.select_user2(uid);
	}
	
	public List<User2DTO> findalluser2() {
		return dao.select_all_user2();
	}
	
	public void modifyuser2(User2DTO dto) {
		dao.update_user2(dto);
	}
	
	public void removeuser2(String uid) {
		dao.delete_user(uid);
	}
	
	
}

package service;

import java.util.List;

import dao.User4DAO;
import dto.User3DTO;
import dto.User4DTO;

public enum User4Service {
	
	INSTANCE;
	
	private User4DAO dao = User4DAO.getinstance();
	
	public void registerUser4(User4DTO dto) {
		dao.insert_user4(dto);
	}
	
	public User4DTO findUser4(String prod_no) {
		return dao.select_user4(prod_no);
	}
	
	public List<User4DTO> findAllUser4() {
		return dao.select_all_user4();
	}
	
	public void modifyUser4(User4DTO dto) {
		dao.update_user4(dto);
	}
	
	public void removeUser4(String uid) {
		dao.delete_user4(uid);
	}
	
	
	
}

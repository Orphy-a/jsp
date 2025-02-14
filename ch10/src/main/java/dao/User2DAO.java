package dao;

import dto.User2DTO;
import util.DBHelper;
import util.SQL;

public class User2DAO extends DBHelper {
	
	
	
	// CRUD
	public void insertUser2(User2DTO dto) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER2);
			psmt.setString(1, dto.getUid());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getBirth());
			psmt.setString(4, dto.getAddr());
			psmt.executeUpdate();
			closeAll();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public User2DTO selectUser2(String uid) {
		
		User2DTO dto = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER2);
			psmt.setString(1, uid);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto = new User2DTO();
				dto.setUid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setBirth(rs.getString(3));
				dto.setAddr(rs.getString(4));
				
			}
			
			closeAll();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
		
	}
	
	
	

	
}

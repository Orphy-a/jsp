package dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.User3DTO;
import util.DBHelper;
import util.SQL;

public class User3DAO extends DBHelper{
	
	// 싱글턴
	private static final User3DAO INSTANCE = new User3DAO();
	public static User3DAO getInstance() {
		return INSTANCE;
	}
	private User3DAO() {}
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// CRUD
	public void insert_user3(User3DTO dto) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER3);
			psmt.setString(1, dto.getUid());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setString(4, dto.getPos());
			psmt.executeUpdate();
			
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		
		
	}
	public User3DTO select_user3(String uid) {
		
		User3DTO dto = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER3);
			psmt.setString(1, uid);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto = new User3DTO();
				dto.setUid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setHp(rs.getString(3));
				dto.setPos(rs.getString(4));
				dto.setRdate(rs.getString(5));

			}
			closeAll();
			
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return dto;
		
	}
	public List<User3DTO> select_all_user3() {
		
		List<User3DTO> dtos = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_ALL_USER3);
			
			
			while (rs.next()) {
				User3DTO dto = new User3DTO();
				
				dto.setUid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setHp(rs.getString(3));
				dto.setPos(rs.getString(4));
				dto.setRdate(rs.getString(5));
				dtos.add(dto);
				
			}
			
			closeAll();
			
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		
		return dtos;
		
	}
	public void update_user3(User3DTO dto) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER3);
			
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getHp());
			psmt.setString(3, dto.getPos());
			psmt.setString(4, dto.getUid());
			psmt.executeUpdate();
			
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
	}
	public void delete_user3(String uid) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER3);
			
			psmt.setString(1, uid);
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
	}
	
	
	
}

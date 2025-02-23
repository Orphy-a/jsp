package dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.User4DTO;
import util.DBHelper;
import util.SQL;

public class User4DAO extends DBHelper {
	
	private static final User4DAO INSTANCE = new User4DAO();
	
	public static User4DAO getinstance() {
		return INSTANCE;
	}
	
	private User4DAO() {}
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// CRUD
	
	public void insert_user4(User4DTO dto) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER4);
			psmt.setInt(1, dto.getProd_no());
			psmt.setString(2, dto.getProd_name());
			psmt.setInt(3, dto.getProd_price());
			psmt.setInt(4, dto.getProd_stock());
			psmt.setString(5, dto.getProd_company());
			psmt.executeUpdate();
			
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		
	}
	
	public User4DTO select_user4(String prod_no) {
		
		User4DTO dto = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER4);
			psmt.setString(1, prod_no);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				
				dto = new User4DTO();
				dto.setProd_no(rs.getInt(1));
				dto.setProd_name(rs.getString(2));
				dto.setProd_price(rs.getInt(3));
				dto.setProd_stock(rs.getInt(4));
				dto.setProd_company(rs.getString(5));
				dto.setProd_date(rs.getString(6));
				

			}

			closeAll();
			
			
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return dto;

		
	}
	
	public List<User4DTO> select_all_user4() {
		
		List<User4DTO> dtos = new ArrayList<>();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ALL_USER4);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				User4DTO dto = new User4DTO();
				dto.setProd_no(rs.getInt(1));
				dto.setProd_name(rs.getString(2));
				dto.setProd_price(rs.getInt(3));
				dto.setProd_stock(rs.getInt(4));
				dto.setProd_company(rs.getString(5));
				dto.setProd_date(rs.getString(6));
				dtos.add(dto);

			}
			
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		
		return dtos;
		
	}
	
	public void update_user4(User4DTO dto) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER4);
			
			psmt.setString(1, dto.getProd_name());
			psmt.setInt(2, dto.getProd_price());
			psmt.setInt(3, dto.getProd_stock());
			psmt.setString(4, dto.getProd_company());
			psmt.setInt(5, dto.getProd_no());
			psmt.executeUpdate();
			
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
	}
	
	public void delete_user4(String prod_no) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER4);
			
			psmt.setString(1, prod_no);
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	
	
	
}

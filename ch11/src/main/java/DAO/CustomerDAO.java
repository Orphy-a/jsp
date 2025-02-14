package DAO;

import java.util.List;

import DTO.CustomerDTO;
import util.DBHelper;
import util.SQL;

public class CustomerDAO extends DBHelper{
	
	private static final CustomerDAO instance = new CustomerDAO();
	
	public static CustomerDAO getinstance() {
		return instance;
	}
	
	private CustomerDAO() {}
	
	public void insertCustomer(CustomerDTO dto) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			
			psmt.setString(1, dto.getCustid());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setString(4, dto.getAddr());
			psmt.executeUpdate();
			closeAll();
			
		}catch(Exception e) {
			e.printStackTrace();
			
			// 시스템 개선 및 업데이트 활요하기 위해 에러 내용을 로깅
			logger.error(e.getMessage());
		}
	}
	
	public CustomerDTO selectCustomer(String uid) {
		try {
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<CustomerDTO> selectAllCustomer() {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void updateCustomer(CustomerDTO dto) {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCustomer(String custid) {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

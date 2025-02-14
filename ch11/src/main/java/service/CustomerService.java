package service;

import java.util.List;

import DAO.CustomerDAO;
import DTO.CustomerDTO;

public enum CustomerService {
	
	// enum 열거형 싱글톤
	INSTANCE; 
	
	private CustomerDAO dao = CustomerDAO.getinstance();
	
	public void registerCustomer(CustomerDTO dto) {
		dao.insertCustomer(dto);
	}
	
	public CustomerDTO findCustomer(String custId) {
		return dao.selectCustomer(custId);
	}
	
	public List<CustomerDTO> findAllCustomer() {
		return dao.selectAllCustomer();
	}
	
	public void modifyCustomer(CustomerDTO dto)	{
		dao.updateCustomer(dto);
	}
	
	public void deleteCustomer(String custId) {
		dao.deleteCustomer(custId);
	}
}
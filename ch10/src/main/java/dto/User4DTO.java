package dto;

public class User4DTO {
	
	private int prod_no;
	private String prod_name;
	private int prod_price;
	private int prod_stock;
	private String prod_company;
	private String prod_date;
	public int getProd_no() {
		return prod_no;
	}
	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	public int getProd_stock() {
		return prod_stock;
	}
	public void setProd_stock(int prod_stock) {
		this.prod_stock = prod_stock;
	}
	public String getProd_company() {
		return prod_company;
	}
	public void setProd_company(String prod_company) {
		this.prod_company = prod_company;
	}
	public String getProd_date() {
		return prod_date;
	}
	public void setProd_date(String prod_date) {
		this.prod_date = prod_date;
	}
	
	public void setProd_no(String prod_no) {
		if(prod_no != null) {
			this.prod_no = Integer.parseInt(prod_no);	
		}
	}
	
	public void setProd_price(String prod_price) {
		if(prod_price != null) {
			this.prod_price = Integer.parseInt(prod_price);	
		}
	}

	public void setProd_stock(String prod_stock) {
		if(prod_stock != null) {
			this.prod_stock = Integer.parseInt(prod_stock);	
		}
	}
	
	@Override
	public String toString() {
		return "User4DTO [prod_no=" + prod_no + ", prod_name=" + prod_name + ", prod_price=" + prod_price
				+ ", prod_stock=" + prod_stock + ", prod_company=" + prod_company + ", prod_date=" + prod_date + "]";
	}
	
	
	
	
	
}

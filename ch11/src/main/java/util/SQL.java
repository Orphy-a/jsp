package util;

public class SQL {

	// user1
	public static final String INSERT_CUSTOMER = "insert into `customer` values (?,?,?,?,now())";
	public static final String SELECT_CUSTOMER = "select * from `customer` where `custid` = ?";
	public static final String SELECT_ALL_CUSTOMER= "select * from `customer`";
	public static final String UPDATE_CUSTOMER = "update `user1` set "
												+ "`name`=?,"
												+ "`hp`=?,"
												+ "`age`=? where `uid`=?";
	
	public static final String DELETE_USER1 = "delete from `user1` where `uid`=?";
	
	
	public static final String INSERT_USER2 = "insert into `user2` values (?,?,?,?)";
	public static final String SELECT_USER2 = "select * from `user2` where `uid` = ?";
	public static final String SELECT_ALL_USER2 = "select * from `user2`";
	public static final String UPDATE_USER2 = "update `user2` set `name`=?,`birth`=?,`addr`=? where `uid`=?";
	public static final String DELETE_USER2 = "delete from `user2` where `uid`=?";
	
	
	
}

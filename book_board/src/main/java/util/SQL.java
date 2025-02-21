package util;

public class SQL {
	
	public static final String BOARD_INSERT = "insert into `board` (`seq`,`title`,`writer`,`content`) values ((select nvl(max(seq)),0) + from board),?,?,?";
	
	public static final String BOARD_UPDATE = "update `board` set `title`=?, `content`=? where `seq`=?";
	
	public static final String BOARD_DELETE = "delete `board` where `seq`=?";
	
	public static final String BOARD_SEARCH = "select * from `board` where `seq`=?";

	public static final String BOARD_LIST = "select * from `board` order by `seq` desc";
	
	
	
}

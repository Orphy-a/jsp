package com.ssamz.biz.board;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import util.DBhelper;
import util.SQL;

public class BoardDAO extends DBhelper{
	
	// 싱글턴
	private static final BoardDAO INSTANCE = new BoardDAO();
	public static BoardDAO getinstance() {
		return INSTANCE;
	}
	private BoardDAO() {}
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public void insertBoard(BoardVO vo) {
		
		try {
			conn = getconnection();
			psmt = conn.prepareStatement(SQL.BOARD_INSERT);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getWriter());
			psmt.setString(3, vo.getContent());
			psmt.executeQuery();
			
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
	}
	
	public void updateBoard(BoardVO vo) {
		
		try {
			conn = getconnection();
			psmt = conn.prepareStatement(SQL.BOARD_UPDATE);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getContent());
			psmt.setInt(3, vo.getSeq());
			psmt.executeUpdate();
			
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
	}
	
	
	public void deleteBoard(BoardVO vo) {
		try {
			
			conn = getconnection();
			psmt = conn.prepareStatement(SQL.BOARD_DELETE);
			psmt.setInt(1, vo.getSeq());
			psmt.executeUpdate();
			
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	public BoardVO searchBoard(int seq) {
		
		BoardVO vo = null;
		
		try {
			conn = getconnection();
			psmt = conn.prepareStatement(SQL.BOARD_SEARCH);
			psmt.setInt(1, seq);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				
				vo = new BoardVO();
				vo.setSeq(rs.getInt("seq"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setContent(rs.getString("content"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setCnt(rs.getInt("cnt"));
				
			}
			
			closeAll();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return vo;
		
	}
	
	public List<BoardVO> listBoard() {
		
		List<BoardVO> vos = new ArrayList<>();
		
		try {
			conn = getconnection();
			stmt = conn.createStatement();
			stmt.executeQuery(SQL.BOARD_LIST);
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setSeq(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setWriter(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setRegdate(rs.getString(4));
				vo.setCnt(rs.getInt(5));
				vos.add(vo);
				
			}
			
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return vos;
		
	}
	
	
}

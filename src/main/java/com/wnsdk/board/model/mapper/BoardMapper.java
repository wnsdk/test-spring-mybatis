package com.wnsdk.board.model.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.wnsdk.board.model.BoardDto;
import com.wnsdk.util.PageNavigation;

public interface BoardMapper {
	
	int writeArticle(BoardDto boardDto) throws SQLException;
	List<BoardDto> listArticle(Map<String, Object> map) throws SQLException;
	int getTotalArticleCount(Map<String, Object> map) throws SQLException;
	BoardDto getArticle(int articleNo) throws SQLException;
	void updateHit(int articleNo) throws SQLException;
	void modifyArticle(BoardDto boardDto) throws SQLException;
	void deleteArticle(int articleNo) throws SQLException;
	void registerFile(BoardDto boardDto) throws SQLException;
}
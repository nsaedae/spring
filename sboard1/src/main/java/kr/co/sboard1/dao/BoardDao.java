package kr.co.sboard1.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sboard1.vo.ArticleVo;

@Repository
public class BoardDao {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertArticle(ArticleVo vo) {
		mybatis.insert("mapper.board.INSERT_ARTICLE", vo);
	}
	
	public void selectArticle() {}
	public void selectArticles() {}
	public void updateArticle() {}
	public void deleteArticle() {}
}

package kr.co.sboard1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard1.dao.BoardDao;
import kr.co.sboard1.vo.ArticleVo;

@Service
public class BoardService {

	@Autowired
	private BoardDao dao;
	
	public void insertArticle(ArticleVo vo) {
		dao.insertArticle(vo);
	}
	
	public void selectArticle() {}
	public void selectArticles() {}
	public void updateArticle() {}
	public void deleteArticle() {}
	
}

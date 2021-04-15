package kr.co.sboard1.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sboard1.vo.TermsVo;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser() {}
	public TermsVo selectTerms() {
		return mybatis.selectOne("mapper.user.SELECT_TERMS");
	}
	public void selectUser() {}
	public void selectUsers() {}
	public void updateUser() {}
	public void deleteUser() {}
	
}

package kr.co.sboard1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard1.dao.UserDao;
import kr.co.sboard1.vo.TermsVo;
import kr.co.sboard1.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public void insertUser() {}
	public TermsVo selectTerms() {
		return dao.selectTerms();
	}
	public UserVo selectUser() {
		return dao.selectUser();
	}
	public void selectUsers() {}
	public void updateUser() {}
	public void deleteUser() {}
}

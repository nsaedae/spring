package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.UserDao;
import kr.co.ch05.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public void insertUser(UserVo vo) {
		dao.insertUser(vo);
	}
	
	public UserVo selectUser(String uid) {
		return dao.selectUser(uid);
	}
	
	public List<UserVo> selectUsers() {
		return dao.selectUsers();
	}
	
	public void updateUser(UserVo vo) {
		dao.updateUser(vo);
	}
	
	public void deleteUser(UserVo vo) {
		dao.deleteUser(vo);		
	}
}

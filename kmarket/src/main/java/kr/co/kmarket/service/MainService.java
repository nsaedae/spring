package kr.co.kmarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket.dao.MainDao;
import kr.co.kmarket.vo.CategoriesVo;

@Service
public class MainService {

	@Autowired
	private MainDao dao;
	
	public List<CategoriesVo> selectCategories(){
		return dao.selectCategories();
	}
}

package kr.co.kmarket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.CategoriesVo;

@Repository
public interface MainDao {

	public List<CategoriesVo> selectCategories();
	
}

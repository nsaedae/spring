package kr.co.kmarket.dao.admin;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.Cate1Vo;

@Repository
public interface AdminProductDao {

	public void insertProduct();
	
	public List<Cate1Vo> selectCate1();
	
	public void selectProduct();
	public void selectProducts();
	public void updateProduct();
	public void deleteProduct();
	
	
}

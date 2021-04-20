package kr.co.kmarket.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket.dao.admin.AdminProductDao;
import kr.co.kmarket.vo.Cate1Vo;
import kr.co.kmarket.vo.Cate2Vo;

@Service
public class AdminProductService {

	@Autowired
	private AdminProductDao dao;
	
	public void insertProduct() {}
	
	public List<Cate1Vo> selectCate1() {
		return dao.selectCate1();
	}
	
	public List<Cate2Vo> selectCate2(int code1) {
		return dao.selectCate2(code1);
	}
	
	public void selectProduct() {}
	public void selectProducts() {}
	public void updateProduct() {}
	public void deleteProduct() {}
}









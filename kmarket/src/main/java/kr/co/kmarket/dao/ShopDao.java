package kr.co.kmarket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.CartVo;
import kr.co.kmarket.vo.ProductVo;

@Repository
public interface ShopDao {
	
	public ProductVo selectTitles(int cate1, int cate2);
	public List<ProductVo> selectProducts(int cate1, int cate2, String sort);
	public ProductVo selectProduct(int code);

	public int insertCart(CartVo vo);
}

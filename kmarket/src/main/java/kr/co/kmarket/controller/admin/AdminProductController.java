package kr.co.kmarket.controller.admin;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import kr.co.kmarket.service.admin.AdminProductService;
import kr.co.kmarket.vo.Cate1Vo;
import kr.co.kmarket.vo.Cate2Vo;
import kr.co.kmarket.vo.ProductVo;

@Controller
public class AdminProductController {
	
	@Autowired
	private AdminProductService service;
	
	@ResponseBody
	@GetMapping("/admin/product/cate1")
	public List<Cate1Vo> cate1() {
		List<Cate1Vo> cate1List = service.selectCate1();
		return cate1List;
	}
	
	@ResponseBody
	@GetMapping("/admin/product/cate2")
	public List<Cate2Vo> cate2(int code1) {
		List<Cate2Vo> cate2List = service.selectCate2(code1);
		return cate2List;
	}
	
	
	
	@GetMapping("/admin/product/list")
	public String list() {
		return "/admin/product/list";
	}
	
	@GetMapping("/admin/product/register")
	public String register() {
		return "/admin/product/register";
	}
	
	@PostMapping("/admin/product/register")
	public String register(ProductVo vo, HttpServletRequest req) {
		
		String ip = req.getRemoteAddr();
		vo.setIp(ip);
		
		// 상품 등록 이미지 업로드
		File file = new File("src/main/resources/static/thumb/");
		String path = file.getAbsolutePath();
		
		MultipartFile[] files = {vo.getFile1(), vo.getFile2(), vo.getFile3(), vo.getFile4()};		
		
		for(int i=0 ; i<4 ; i++) {
			
			MultipartFile mf = files[i];
			
			if(!mf.isEmpty()) {
				// 파일을 첨부했을 경우
				String name = mf.getOriginalFilename();
				String ext  = name.substring(name.lastIndexOf("."));
				
				String uName = UUID.randomUUID().toString()+ext;
				String fullPath = path+"/"+vo.getCate1()+"/"+vo.getCate2()+"/";
				
				try {
					Path root = Paths.get(fullPath);
					Files.createDirectories(root);
					
					mf.transferTo(new File(fullPath+uName));
					
					if(i == 0) vo.setThumb1(uName);
					if(i == 1) vo.setThumb2(uName);
					if(i == 2) vo.setThumb3(uName);
					if(i == 3) vo.setDetail(uName);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		service.insertProduct(vo);
				
		return "redirect:/admin/product/register";
	}
	
}

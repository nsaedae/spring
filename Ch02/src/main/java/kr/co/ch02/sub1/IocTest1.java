package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2021/04/12
 * 이름 : 김철학
 * 내용 : 스프링 Ioc 실습하기 
 */
public class IocTest1 {
	
	public static void main(String[] args) {
		
		// Ioc 적용 X
		Tv ltv = new LgTv();
		ltv.power();
		ltv.chUp();
		ltv.chDown();
		
		Tv stv = new SamsungTv();
		stv.power();
		stv.chUp();
		stv.chDown();
		
		// Ioc 적용 O		
		// 스프링 컨테이너 객체 생성
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		Tv lgtv  = (Tv) ctx.getBean("lgtv");
		Tv smtv  = (Tv) ctx.getBean("smtv");
		
		lgtv.power();
		lgtv.chUp();
		lgtv.chDown();
		
		smtv.power();
		smtv.chUp();
		smtv.chDown();
		
	}

}

package kr.co.ch02.sub2;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class LgTv implements Tv {
	
	@Inject
	private Speaker speaker;
	
	@Override
	public void power() {
		System.out.println("LgTv power...");
	}
	@Override
	public void chUp() {
		System.out.println("LgTv chUp...");
	}
	@Override
	public void chDown() {
		System.out.println("LgTv chDown...");
	}
	@Override
	public void soundUp() {
		speaker.soundUp();
	}
	@Override
	public void soundDown() {
		speaker.soundDown();
	}
}

package org.slowspace.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
// 생성자의 자동 주입 + Lombok
//@AllArgsConstructor
@RequiredArgsConstructor
public class SampleHotel {
	
	// 묵시적 생성자 주입 방식
//	private Chef chef;
//	public SampleHotel(Chef chef) {
//		this.chef = chef;
//	}
	
	// 생성자의 자동 주입 + Lombok
//	private Chef chef;
	
	// 특정한 변수에 대해서만 생성자 작성
	@NonNull
	private Chef chef;
}

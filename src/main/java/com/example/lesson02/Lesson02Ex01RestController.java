package com.example.lesson02;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.domain.UsedGoods;

@RestController
public class Lesson02Ex01RestController {
	
	// http://localhost/lesson01/ex01
	@RequestMapping("/lesson01/ex01")
	public List<UsedGoods> ex01(){
		List<UsedGoods> usedGoodsList = ;
		return usedGoodsList; // json 응답
	}
}
package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewMapper;
import com.example.lesson03.domain.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewMapper reviewMapper;
	
	// input: id
	// output: id에 일치하는 Review 단건 => 컨트롤러한테 
	public Review getReviewById(int id) {
		return reviewMapper.selectReviewById(id);
	}
	
	// input: Review
	// output: 성공된 행의 개수 int
	/* insert */
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	
	public int addReviewAsField(int storeId, String menu, String userName, double point, String review) {
		return reviewMapper.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
	/* update */
	public int updateReviewById(int id, String review) {
		return reviewMapper.updateReviewById(id, review);
	}
}












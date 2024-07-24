package com.job.app.reviews;

import java.util.List;

public interface ReviewServices {

	List<Reviews> getAllReviews();

	void createReview(Reviews review);

	Reviews getReviewById(Long reviewId);

	Boolean updateReviewById(Reviews reviews, Long id);

	Boolean deleteById(Long companyId, Long reviewId);

}

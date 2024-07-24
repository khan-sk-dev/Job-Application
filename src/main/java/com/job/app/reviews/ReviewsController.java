package com.job.app.reviews;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewsController {

	private ReviewServices reviewServices;

	public ReviewsController(ReviewServices reviewServices) {
		this.reviewServices = reviewServices;
	}

	@GetMapping("/reviews")
	public List<Reviews> getAllReviews() {
		return reviewServices.getAllReviews();
	}

	@PostMapping("/reviews")
	public ResponseEntity<String> createReview(@RequestBody Reviews review) {
		reviewServices.createReview(review);
		return new ResponseEntity<>("Review Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping("/reviews/{reviewId}")
	public ResponseEntity<Reviews> getReviewById(@PathVariable("{reviewId}") Long id) {
		Reviews reviews = reviewServices.getReviewById(id);
		if (reviews != null) {
			return new ResponseEntity<>(reviews, HttpStatus.FOUND);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/reviews/{reviewId}")
	public ResponseEntity<String> updateReview(@RequestBody Reviews review, @PathVariable("reviewId") Long id) {
		if (reviewServices.updateReviewById(review, id)) {
			return new ResponseEntity<>("Review Updated succesfully", HttpStatus.OK);
		}
		return new ResponseEntity<>("Review Updated succesfully", HttpStatus.EXPECTATION_FAILED);

	}

	@DeleteMapping("/reviews/{reviewId}")
	public ResponseEntity<String> deleteById(@PathVariable("companyId") Long companyId,
			@PathVariable("reviewId") Long reviewId) {
		if (reviewServices.deleteById(companyId, reviewId)) {
			return new ResponseEntity<>("Review Deleted succesfully", HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>("no such review found", HttpStatus.NOT_FOUND);
	}

}

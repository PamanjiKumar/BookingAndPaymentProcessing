package RatingsAndReviews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller: ReviewController
@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
@Autowired
private ReviewService service;

@PostMapping
public Review submitReview(@RequestBody Review review) {
   return service.addReview(review);
}

@GetMapping
public List<Review> getAllReviews() {
   return service.getAllReviews();
}
}

package RatingsAndReviews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Service: ReviewService
@Service
public class ReviewService {
@Autowired
private ReviewRepository repo;

public Review addReview(Review review) {
   return repo.save(review);
}

public List<Review> getAllReviews() {
   return repo.findAll();
}
}

package RatingsAndReviews;

import org.springframework.data.jpa.repository.JpaRepository;

//Repository: ReviewRepository
public interface ReviewRepository extends JpaRepository<Review, Long> {}


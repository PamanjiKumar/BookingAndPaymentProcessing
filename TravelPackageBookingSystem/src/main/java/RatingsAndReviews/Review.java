package RatingsAndReviews;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//============================
//MODULE 4: Reviews & Ratings
//============================

//Entity: Review
@Entity
public class Review {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long reviewId;

 private Long userId;
 private Long packageId;
 private int rating;
 private String comment;
 private String timestamp;
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public Long getPackageId() {
	return packageId;
}
public void setPackageId(Long packageId) {
	this.packageId = packageId;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public String getTimestamp() {
	return timestamp;
}
public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
}

 // Getters and Setters
}



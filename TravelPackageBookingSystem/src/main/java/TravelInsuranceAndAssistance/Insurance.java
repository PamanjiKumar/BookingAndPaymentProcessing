package TravelInsuranceAndAssistance;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//============================
//MODULE 5: Travel Insurance & Assistance
//============================

//Entity: Insurance
@Entity
public class Insurance {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long insuranceId;

 private Long userId;
 private Long bookingId;
 private String coverageDetails;
 private String provider;
 private String status;
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public Long getBookingId() {
	return bookingId;
}
public void setBookingId(Long bookingId) {
	this.bookingId = bookingId;
}
public String getCoverageDetails() {
	return coverageDetails;
}
public void setCoverageDetails(String coverageDetails) {
	this.coverageDetails = coverageDetails;
}
public String getProvider() {
	return provider;
}
public void setProvider(String provider) {
	this.provider = provider;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

 // Getters and Setters
}






package TravelInsuranceAndAssistance;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//Entity: AssistanceRequest
@Entity
public class AssistanceRequest {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long requestId;

private Long userId;
private String issueDescription;
private String status;
private String resolutionTime;
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public String getIssueDescription() {
	return issueDescription;
}
public void setIssueDescription(String issueDescription) {
	this.issueDescription = issueDescription;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getResolutionTime() {
	return resolutionTime;
}
public void setResolutionTime(String resolutionTime) {
	this.resolutionTime = resolutionTime;
}

// Getters and Setters
}

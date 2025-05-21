package TravelInsuranceAndAssistance;

import org.springframework.data.jpa.repository.JpaRepository;

//Repository: InsuranceRepository & AssistanceRepository
public interface AssistanceRepository extends JpaRepository<AssistanceRequest, Long> {}


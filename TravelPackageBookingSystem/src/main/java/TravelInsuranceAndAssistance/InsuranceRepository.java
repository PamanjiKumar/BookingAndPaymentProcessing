package TravelInsuranceAndAssistance;

import org.springframework.data.jpa.repository.JpaRepository;

//Repository: InsuranceRepository & AssistanceRepository
public interface InsuranceRepository extends JpaRepository<Insurance, Long> {}
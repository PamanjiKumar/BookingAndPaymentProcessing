package TravelInsuranceAndAssistance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Service: InsuranceService
@Service
public class InsuranceService {
@Autowired
private InsuranceRepository insuranceRepo;
@Autowired
private AssistanceRepository assistanceRepo;

public Insurance addInsurance(Insurance insurance) {
   return insuranceRepo.save(insurance);
}

public AssistanceRequest requestHelp(AssistanceRequest request) {
   return assistanceRepo.save(request);
}

public List<AssistanceRequest> getRequests() {
   return assistanceRepo.findAll();
}
}

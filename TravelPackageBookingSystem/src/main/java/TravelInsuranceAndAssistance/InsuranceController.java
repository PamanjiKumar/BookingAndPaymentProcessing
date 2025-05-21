package TravelInsuranceAndAssistance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Controller: InsuranceController
@RestController
@RequestMapping("/api/insurance")
public class InsuranceController {
@Autowired
private InsuranceService service;

@PostMapping("/buy")
public Insurance buyInsurance(@RequestBody Insurance insurance) {
   return service.addInsurance(insurance);
}

@PostMapping("/help")
public AssistanceRequest help(@RequestBody AssistanceRequest request) {
   return service.requestHelp(request);
}

@GetMapping("/requests")
public List<AssistanceRequest> getRequests() {
   return service.getRequests();
}
}

//End of Full Backend Code Implementation
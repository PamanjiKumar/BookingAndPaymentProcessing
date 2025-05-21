package com.TravelPackageManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Service: TravelPackageService
@Service
public class TravelPackageService {
@Autowired
private TravelPackageRepository repo;

public List<TravelPackage> getAllPackages() {
   return repo.findAll();
}

public TravelPackage addPackage(TravelPackage travelPackage) {
   return repo.save(travelPackage);
}

public void deletePackage(Long id) {
   repo.deleteById(id);
}
}

package com.TravelPackageManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller: TravelPackageController
@RestController
@RequestMapping("/api/packages")
public class TravelPackageController {
@Autowired
private TravelPackageService service;

@GetMapping
public List<TravelPackage> getAllPackages() {
   return service.getAllPackages();
}

@PostMapping
public TravelPackage addPackage(@RequestBody TravelPackage travelPackage) {
   return service.addPackage(travelPackage);
}

@DeleteMapping("/{id}")
public void deletePackage(@PathVariable Long id) {
   service.deletePackage(id);
}
}

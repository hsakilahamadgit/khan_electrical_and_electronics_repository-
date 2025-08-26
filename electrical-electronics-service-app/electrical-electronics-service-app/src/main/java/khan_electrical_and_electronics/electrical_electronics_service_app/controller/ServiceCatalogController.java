package khan_electrical_and_electronics.electrical_electronics_service_app.controller;

import khan_electrical_and_electronics.electrical_electronics_service_app.dto.ServiceCatalogDTO;
import khan_electrical_and_electronics.electrical_electronics_service_app.service.ServiceCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/services")
public class ServiceCatalogController {
@Autowired
    private ServiceCatalogService serviceCatalogService;

    @GetMapping
    ResponseEntity<List<ServiceCatalogDTO>> getAllServices() {
        // This method will return a list of all services in the catalog
        List<ServiceCatalogDTO> services = serviceCatalogService.getAllServices();
        return new ResponseEntity<>(services, org.springframework.http.HttpStatus.OK);
    }
}

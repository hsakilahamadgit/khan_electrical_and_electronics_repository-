package khan_electrical_and_electronics.electrical_electronics_service_app.controller;

import jakarta.validation.Valid;
import khan_electrical_and_electronics.electrical_electronics_service_app.dto.ServiceRequestDto;
import khan_electrical_and_electronics.electrical_electronics_service_app.service.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceRequestController {

    @Autowired
private ServiceRequestService serviceRequestService;

    @PostMapping("/service-requests")
    public ResponseEntity<ServiceRequestDto> bookServiceRequest( @RequestBody @Valid ServiceRequestDto serviceRequestDto) {



        ServiceRequestDto savedServiceRequest=serviceRequestService.createServiceRequest(serviceRequestDto);


        // Logic to handle the creation of a service request
        // This will typically involve calling a service layer method
        // and returning the created ServiceRequestDto

        return ResponseEntity.ok(savedServiceRequest); // Placeholder response
    }


}

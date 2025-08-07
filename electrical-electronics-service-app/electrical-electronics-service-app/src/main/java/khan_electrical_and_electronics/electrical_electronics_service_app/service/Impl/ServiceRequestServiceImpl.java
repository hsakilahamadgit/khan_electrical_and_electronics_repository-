package khan_electrical_and_electronics.electrical_electronics_service_app.service.Impl;

import khan_electrical_and_electronics.electrical_electronics_service_app.dto.ServiceRequestDto;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.ServiceRequest;
import khan_electrical_and_electronics.electrical_electronics_service_app.repository.ServiceRequestRepository;
import khan_electrical_and_electronics.electrical_electronics_service_app.service.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRequestServiceImpl implements ServiceRequestService {

    @Autowired
  private   ServiceRequestRepository serviceRequestRepository;
    @Override
    public ServiceRequest createServiceRequest(ServiceRequestDto serviceRequestDto) {


        return null;
    }
}

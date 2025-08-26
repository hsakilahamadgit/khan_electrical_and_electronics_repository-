package khan_electrical_and_electronics.electrical_electronics_service_app.service.Impl;

import khan_electrical_and_electronics.electrical_electronics_service_app.dto.ExternalUserDto;
import khan_electrical_and_electronics.electrical_electronics_service_app.dto.ServiceRequestDto;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.ServiceRequest;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.User;
import khan_electrical_and_electronics.electrical_electronics_service_app.mapper.ServiceRequestMapper;
import khan_electrical_and_electronics.electrical_electronics_service_app.repository.ServiceRequestRepository;
import khan_electrical_and_electronics.electrical_electronics_service_app.repository.UserRepository;
import khan_electrical_and_electronics.electrical_electronics_service_app.service.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRequestServiceImpl implements ServiceRequestService {

    private static ExternalUserDto storeDto;
    @Autowired
    private ServiceRequestRepository serviceRequestRepository;

    @Autowired
    private UserRepository userRepository;

    public static void ExternalUser(ExternalUserDto externalUserDto) {
        storeDto = externalUserDto;
        // This method seems to be unused in the current context.
        // If you need to use it, you can implement the logic here.

    }

    @Override
    public ServiceRequestDto createServiceRequest(ServiceRequestDto serviceRequestDto) {
       /* ExternalUserDto externalUserDto = new ExternalUserDto();
      Long getId =externalUserDto.getId();*/
        ServiceRequest serviceRequest = ServiceRequestMapper.mapToEntity(serviceRequestDto);
        User loggedIdUser = userRepository.findById(storeDto.getId()).orElseThrow(() -> new RuntimeException("User not found with id: " + storeDto.getId()));
        //.ifPresent(user -> serviceRequest.setUser(user)); // Set the user from the repository
        serviceRequest.setUser(loggedIdUser); // Assuming userId is set to 1 for this example

        ServiceRequest savedServiceRequest = serviceRequestRepository.save(serviceRequest);
        // If you need to set the userId in the savedServiceRequest, you can do it here
        return ServiceRequestMapper.mapToDto(savedServiceRequest);
    }
}

package khan_electrical_and_electronics.electrical_electronics_service_app.mapper;

import khan_electrical_and_electronics.electrical_electronics_service_app.dto.ServiceRequestDto;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.ServiceRequest;

public class ServiceRequestMapper {

// map to DTO
    public static ServiceRequestDto mapToDto(ServiceRequest serviceRequest) {
        ServiceRequestDto serviceRequestDto = new ServiceRequestDto();
        serviceRequestDto.setUrgencyAddress(serviceRequest.getUrgencyAddress());
        serviceRequestDto.setIssueDescription(serviceRequest.getIssueDescription());
        serviceRequestDto.setPreferredDate(serviceRequest.getPreferredDate());
        return serviceRequestDto;
    }

    // map to Entity
   public  static ServiceRequest mapToEntity(ServiceRequestDto serviceRequestDto) {
        ServiceRequest serviceRequest = new ServiceRequest();
        serviceRequest.setUrgencyAddress(serviceRequestDto.getUrgencyAddress());
        serviceRequest.setIssueDescription(serviceRequestDto.getIssueDescription());
        serviceRequest.setPreferredDate(serviceRequestDto.getPreferredDate());
        return serviceRequest;
    }


}

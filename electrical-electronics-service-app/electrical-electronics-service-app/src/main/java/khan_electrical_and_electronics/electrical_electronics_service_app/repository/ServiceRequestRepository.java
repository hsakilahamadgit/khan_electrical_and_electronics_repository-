package khan_electrical_and_electronics.electrical_electronics_service_app.repository;

import khan_electrical_and_electronics.electrical_electronics_service_app.entity.ServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Long> {

    // Custom query methods can be defined here if needed
    // For example, to find service requests by user or status
    // List<ServiceRequest> findByUserId(Long userId);
    // List<ServiceRequest> findByStatus(String status);
}

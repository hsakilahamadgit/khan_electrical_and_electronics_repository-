package khan_electrical_and_electronics.electrical_electronics_service_app.repository;

import khan_electrical_and_electronics.electrical_electronics_service_app.entity.ServiceCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceCatalogRepository extends JpaRepository<ServiceCatalog, Long> {

    List<ServiceCatalog> findByIsActiveTrue();

    // Custom query methods can be defined here if needed
    // For example, to find services by name or status
    /*List<Service> findByNameContainingIgnoreCase(String name);

    List<Service> findByIsActive(Boolean isActive);
    */
    // Additional methods can be added as per requirements
}

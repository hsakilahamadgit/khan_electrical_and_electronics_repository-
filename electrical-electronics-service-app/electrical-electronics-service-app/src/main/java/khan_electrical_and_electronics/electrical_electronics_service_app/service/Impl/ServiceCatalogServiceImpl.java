package khan_electrical_and_electronics.electrical_electronics_service_app.service.Impl;

import khan_electrical_and_electronics.electrical_electronics_service_app.dto.ServiceCatalogDTO;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.ServiceCatalog;
import khan_electrical_and_electronics.electrical_electronics_service_app.mapper.ServiceCatalogMapper;
import khan_electrical_and_electronics.electrical_electronics_service_app.repository.ServiceCatalogRepository;
import khan_electrical_and_electronics.electrical_electronics_service_app.service.ServiceCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCatalogServiceImpl implements ServiceCatalogService {

    @Autowired
    private ServiceCatalogRepository serviceCatalogRepository;

    @Override
    public List<ServiceCatalogDTO> getAllServices() {
        // Fetch all services from the repository
      List<ServiceCatalog>serviceCatalogs  =serviceCatalogRepository.findByIsActiveTrue();
        List<ServiceCatalogDTO> serviceCatalogDTOS=ServiceCatalogMapper.mapToDto(serviceCatalogs);





        return serviceCatalogDTOS;
    }
}

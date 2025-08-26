package khan_electrical_and_electronics.electrical_electronics_service_app.mapper;

import khan_electrical_and_electronics.electrical_electronics_service_app.dto.ServiceCatalogDTO;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.ServiceCatalog;

import java.util.ArrayList;
import java.util.List;

public class ServiceCatalogMapper {

    public  static List<ServiceCatalogDTO> mapToDto(List<ServiceCatalog> serviceCatalogList){
        List<ServiceCatalogDTO> serviceCatalogDTOList = new ArrayList<>();
        for (ServiceCatalog serviceCatalog : serviceCatalogList) {
            ServiceCatalogDTO serviceCatalogDTO = new ServiceCatalogDTO();
            serviceCatalogDTO.setId(serviceCatalog.getId());
            serviceCatalogDTO.setName(serviceCatalog.getName());
            serviceCatalogDTO.setDescription(serviceCatalog.getDescription());
            serviceCatalogDTOList.add(serviceCatalogDTO);
        }
        return serviceCatalogDTOList;

    }
}

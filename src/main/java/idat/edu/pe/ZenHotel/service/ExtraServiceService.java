package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.ExtraServiceModel;
import idat.edu.pe.ZenHotel.repository.ExtraServiceRepository;

import java.util.List;

public class ExtraServiceService {
    private final ExtraServiceRepository extraServiceRepository;

    public ExtraServiceService(ExtraServiceRepository extraServiceRepository) {
        this.extraServiceRepository = extraServiceRepository;
    }

    public List<ExtraServiceModel> getExtraServices() {
        return extraServiceRepository.findAll();
    }

    public void saveExtraService (ExtraServiceModel extraservice) {
        extraServiceRepository.save(extraservice);
    }
}

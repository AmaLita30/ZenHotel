package idat.edu.pe.ZenHotel.model;

public class AdditionalServiceModel {
    private Integer idAdService;
    private String additionalService;
    private Double price;
    private String description;

    public AdditionalServiceModel(Integer idAdService, String additionalService, Double price, String description) {
        this.idAdService = idAdService;
        this.additionalService = additionalService;
        this.price = price;
        this.description = description;
    }

    public Integer getIdAdService() {
        return idAdService;
    }

    public void setIdAdService(Integer idAdService) {
        this.idAdService = idAdService;
    }

    public String getAdditionalService() {
        return additionalService;
    }

    public void setAdditionalService(String additionalService) {
        this.additionalService = additionalService;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


package castudy.modles;

public class FreeService {
    private String nameFreeService;
    private String unit;
    private String price;

    public FreeService(String nameFreeService, String unit, String price) {
        this.nameFreeService = nameFreeService;
        this.unit = unit;
        this.price = price;
    }

    public String getNameFreeService() {
        return nameFreeService;
    }

    public void setNameFreeService(String nameFreeService) {
        this.nameFreeService = nameFreeService;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "nameFreeService='" + nameFreeService + '\'' +
                ", unit='" + unit + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

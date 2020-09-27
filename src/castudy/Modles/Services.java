package castudy.Modles;

public abstract class Services {
    private String nameServices;
    private Double area;
    private Double  cost;
    private Double maxNumber;
    private String rentaltype;

    public Services() {
    }

    public Services(String nameServices, Double area, Double cost, Double maxNumber, String rentaltype) {
        this.nameServices = nameServices;
        this.area = area;
        this.cost = cost;
        this.maxNumber = maxNumber;
        this.rentaltype = rentaltype;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Double maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getRentaltype() {
        return rentaltype;
    }

    public void setRentaltype(String rentaltype) {
        this.rentaltype = rentaltype;
    }

    public abstract void showInfor();

    @Override
    public String toString() {
        return "Services{" +
                "nameServices='" + nameServices + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxNumber=" + maxNumber +
                ", rentaltype='" + rentaltype + '\'' +
                '}';
    }
}

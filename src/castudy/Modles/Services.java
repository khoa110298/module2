package castudy.Modles;

public abstract class Services {
    private String id;
    private String nameServices;
    private String area;
    private String cost;
    private String maxNumber;
    private String rentaltype;

    public Services() {
    }

    public Services(String id, String nameServices, String area, String cost, String maxNumber, String rentaltype) {
        this.id = id;
        this.nameServices = nameServices;
        this.area = area;
        this.cost = cost;
        this.maxNumber = maxNumber;
        this.rentaltype = rentaltype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(String maxNumber) {
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
        return "id='" + id + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxNumber=" + maxNumber +
                ", rentaltype='" + rentaltype + '\''
                ;
    }
}

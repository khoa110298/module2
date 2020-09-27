package castudy.Modles;

public class Villa extends Services{
    private String standardRoom;
    private String convenient;
    private Double area;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String nameServices, Double area, Double cost, Double maxNumber, String rentaltype, String standardRoom, String convenient, Double area1, int numberFloors) {
        super(nameServices, area, cost, maxNumber, rentaltype);
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.area = area1;
        this.numberFloors = numberFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    @Override
    public Double getArea() {
        return area;
    }

    @Override
    public void setArea(Double area) {
        this.area = area;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", area=" + area +
                ", numberFloors=" + numberFloors +
                '}'+super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

}

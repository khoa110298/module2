package castudy.Modles;

public class Villa extends Services{
    private String standardRoom;
    private String convenient;
    private String lakeArea;
    private String numberFloors;

    public Villa() {
    }

    public Villa(String standardRoom, String convenient, String area, String numberFloors) {
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.lakeArea = area;
        this.numberFloors = numberFloors;
    }

    public Villa(String id, String nameServices, String area, String cost, String maxNumber, String rentaltype, String standardRoom, String convenient, String area1, String numberFloors) {
        super(id, nameServices, area, cost, maxNumber, rentaltype);
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.lakeArea = area1;
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

    public String getLakeArea() {
        return lakeArea;
    }

    public void setLakeArea(String lakeArea) {
        this.lakeArea = lakeArea;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", area='" + lakeArea + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

}

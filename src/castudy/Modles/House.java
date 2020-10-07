package castudy.Modles;

public class House extends Services {

    private String standardRoom;
    private String convenient;
    private String numberFloors;

    public House() {
    }

    public House(String standardRoom, String convenient, String numberFloors) {
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.numberFloors = numberFloors;
    }

    public House(String id, String nameServices, String area, String cost, String maxNumber, String rentaltype, String standardRoom, String convenient, String numberFloors) {
        super(id, nameServices, area, cost, maxNumber, rentaltype);
        this.standardRoom = standardRoom;
        this.convenient = convenient;
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

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                "standardRoom='" + standardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

}

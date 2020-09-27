package castudy.Modles;

public class House extends Services {

    private String standardRoom;
    private String convenient;
    private int numberFloors;

    public House() {
    }

    public House(String nameServices, Double area, Double cost, Double maxNumber, String rentaltype, String standardRoom, String convenient, int numberFloors) {
        super(nameServices, area, cost, maxNumber, rentaltype);
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

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", numberFloors=" + numberFloors +
                '}'+ super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());

    }

}

package castudy.Modles;

public class Room extends Services{

    private String free;

    public Room() {
    }

    public Room(String nameServices, Double area, Double cost, Double maxNumber, String rentaltype) {
        super(nameServices, area, cost, maxNumber, rentaltype);
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Room{" +
                "free='" + free + '\'' +
                '}'+super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

}

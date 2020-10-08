package castudy.modles;

public class Room extends Services{

    private String free;

    public Room() {
    }

    public Room(String free) {
        this.free = free;
    }

    public Room(String id, String nameServices, String area, String cost, String maxNumber, String rentaltype, String free) {
        super(id, nameServices, area, cost, maxNumber, rentaltype);
        this.free = free;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "free='" + free + '\'' +
                '}';
    }
    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}

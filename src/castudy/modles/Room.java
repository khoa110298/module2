package castudy.modles;

public class Room extends Services{

    private FreeService freeService;

    public Room() {
    }

    public Room(FreeService freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameServices, String area, String cost, String maxNumber, String rentaltype, FreeService freeService) {
        super(id, nameServices, area, cost, maxNumber, rentaltype);
        this.freeService = freeService;
    }

    public FreeService getFreeService() {
        return freeService;
    }

    public void setFreeService(FreeService freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                " freeService=" + freeService +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}

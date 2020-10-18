package thi_modul2;

public abstract class Quanlylophoc {
    private int id;
    private String name;

    public Quanlylophoc() {
    }

    public Quanlylophoc(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String ten) {
        this.name = ten;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\''
                ;
    }
}

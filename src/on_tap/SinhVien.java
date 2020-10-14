package on_tap;

public class SinhVien {
    private String id;
    private String name;
    private String age;
    private String adddresss;

    public SinhVien(String id, String name, String age, String adddresss) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adddresss = adddresss;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdddresss() {
        return adddresss;
    }

    public void setAdddresss(String adddresss) {
        this.adddresss = adddresss;
    }

    @Override
    public String toString() {
        return "SInhVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", adddresss='" + adddresss + '\'' +
                '}';
    }
}

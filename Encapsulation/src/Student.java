public class Student {
    private String name;
    private String adress;

    private int id;

    public Student(String name, String adress, int id){
        this.name = name;
        this.adress = adress;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", id=" + id +
                '}';
    }

}

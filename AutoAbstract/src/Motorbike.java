public class Motorbike extends Vehicle{
    public Motorbike(String name, String color, String company, int track){
        super(name, color, company, track);
    }
    @Override
    public void speak(){
        System.out.println("Ilość kół jest równa: " + track);
    }
}

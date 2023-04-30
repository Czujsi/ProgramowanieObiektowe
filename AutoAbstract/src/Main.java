public class Main {
    public static void main(String[] args) {

        System.out.println("-------AutoMain---------");
        Car car1 = new Car("508","blue","Peugeot", 4);
        System.out.println(car1.company + " " + car1.name + " is color " + car1.color );
        car1.speak();
        Motorbike m1= new Motorbike("301", "black", "Kawasaki", 2);
        System.out.println(m1.company + " " + m1.name + " is color " + m1.color);
        m1.speak();
    }
}
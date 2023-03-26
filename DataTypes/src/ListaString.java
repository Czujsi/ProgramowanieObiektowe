import java.util.Arrays;
import java.util.Collections;

public class ListaString {
    public static void main(String[] args) {
        System.out.println("------------ListaString--------------");
        String[] cars = {"Toyota", "Mercedes", "Opel", "Ślad", "Audi", "Bughatti", "Fiat", "Seat"};
        int cl = cars.length;
        System.out.println("Mamy na liscie tyle aut " + cl);
        System.out.println("Listujemy auto nr 3 "+cars[2]);
        for(String car: cars){
            System.out.printf(car + " | ");
        }
        System.out.println();
        Arrays.sort(cars);
        for(String car: cars){
            System.out.printf(car + " | ");
        }
        Arrays.sort(cars, Collections.reverseOrder());
        System.out.println();
        for (String car: cars){
            System.out.printf(car + " | ");
        }
    }
}

import java.util.ArrayDeque;
import java.util.Queue;

public class Kolejka {
    public static void main(String[] args) {
        System.out.println("------------ Queue -----------");
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Jeden");
        queue.add("Dwa");
        queue.add("Trzy");
        queue.add("Cztery");
        queue.add("Pięć");
        System.out.println(queue);
        queue.poll();
        queue.poll();
        System.out.println(queue + " \t 2 osoby załatwione ");
        queue.remove();
        System.out.println(queue + " \t 1 osoba usunięta ");
        queue.poll();
        queue.poll();
        try {
            queue.remove();
        }catch (Exception e){
            System.out.println("Błąd : " + e);
        }
        System.out.println(queue);
    }
}

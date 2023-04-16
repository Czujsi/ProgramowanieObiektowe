import java.util.ArrayList;
import java.util.Collections;

public class AlistCollection {
    public static void main(String[] args) {
        System.out.println("------------------ArrayList-----------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("Zbyszek");
        list.add("Adam");
        list.add("Maria");
        list.add("Renata");
        list.add("Łucja");
        display(list);
        Collections.sort(list);
        System.out.println("----------Sort ASC-----------");
        display(list);
        Collections.reverse(list);
        display(list);
        System.out.println("------- wybieramy 3 element listy " +list.get(3));
        display(list);
        System.out.println(list);
        for (String e : list) {
            System.out.println(e);
        }
    }
    static void display(ArrayList<String> list){
        int i =0;
        for (String e: list){
            System.out.println(i++ +") \t"+ e);
        }
    }

}

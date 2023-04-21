import java.util.Iterator;
import java.util.LinkedList;

public class AlinkedList {
    public static void main(String[] args) {
        System.out.println("------------ Linked list ------------");
        LinkedList<String> list = new LinkedList<>();
        list.add("Zabrze");
        list.add("Otwock");
        list.add("Wrocław");
        list.add("Gdańsk");
        list.add("Łomianki");
        System.out.println(list);
        wyswietlMiasta(list);
        list.remove(4);
        System.out.println("------- po usunięciu index 4---------");
        wyswietlMiasta(list);
        String szukane = "Otwock";
        if(list.contains("Otwock") == true)
            System.out.println(" znaleziono" + szukane);
        else
            System.out.println("Nie znaleziono " + szukane);

    }
    static void wyswietlMiasta(LinkedList<String> list) {
        Iterator<String> itr =list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

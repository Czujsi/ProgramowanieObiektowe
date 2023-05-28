import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("-----------Exceptions Person IQ-----------");
        //Person p1 = new Person("Marie Curie", 180);
        //Person p2 = new Person("James Maxwell", 190);
        //Person p3 = new Person("Carl Gaus", 250);
        //List<Person> people = new ArrayList<>();
        //people.add(p1);
        //people.add(p2);
        //people.add(p3);
        List<Person> people = ImportData.importPeople();
        int j = 1;
        for(Person p: people){
            System.out.println(p.name + " ... " + p.iq);
        }

        try {
            FileInputStream fis = new FileInputStream("src/iq_lista.txt");
            Scanner sc = new Scanner(fis);
            int i = 1;
            String name;
            int iq;
            String line;
            String[] a;
            while (sc.hasNext()) {
                line = sc.nextLine().strip();
                a = line.split(",");
                name = a[0].strip();
                iq = Integer.parseInt(a[1].strip());
                System.out.println(name + " ___ " + iq);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
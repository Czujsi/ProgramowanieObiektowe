import javax.sql.rowset.CachedRowSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportData {
    public static List<Car> importCars(){
        List<Car> cars = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/car_list_c7.txt");
            Scanner sc = new Scanner(fis);
            String company;
            String model;
            int year;
            int yearStop;
            String l;
            String[] a;
            while (sc.hasNextLine()) {
                l = sc.nextLine().strip();
                a = l.split(",");
                if (a.length>= 4) {
                    company = a[0].strip();
                    model = a[1].strip();
                    year = Integer.parseInt(a[2].strip());
                    yearStop = Integer.parseInt(a[3].strip());
                    Car c = new Car(company, model, year, yearStop);
                    cars.add(c);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return cars;
    }
}

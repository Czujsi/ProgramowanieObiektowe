import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Car> cars = ImportData.importCars();
        Scanner console = new Scanner(System.in);
        System.out.println("Aby wyszukać samochód po marce wpisz 0");
        System.out.println("Aby wyświetlić wszystkie auta wpisz 1");
        int j = 0;
        int i = Integer.parseInt(console.nextLine());
        switch(i){
            case 0:
                System.out.println("Podaj markę jaką chcesz wyszukać");
                String company = console.nextLine();
                for (Car c : cars) {
                    j++;
                    if (c.company.equals(company))
                        System.out.println(j + ") " + "Company: " + c.company + " Model: " + c.model + " year: " + c.year + " yearStop: " + c.yearStop);
                }
                    break;
            case 1:
                for (Car c : cars) {
                    j++;
                    System.out.println(j + ") " + "Company: " + c.company + " Model: " + c.model + " year: " + c.year + " yearStop: " + c.yearStop);
                }
                break;
        }

    }
}
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<IqCountry> rankinIQ = ImportData.importCountry();
        Scanner console = new Scanner(System.in);
        int i = 1;
        int j = 0;
        while(j < 2) {
            System.out.println("\n-----------------------------------------\n");
            for (IqCountry c : rankinIQ) {
                if (j==0)
                        System.out.println(c.place + ") " + c.country + " IQ : " + c.iq);
                else
                    if (c.iq>80 && c.iq<90)
                        System.out.println(c.place + ") " + c.country + " IQ : " + c.iq);
                    else
                        continue;
            }
            j++;
        }
    }

}
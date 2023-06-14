import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportData {
    public static List<IqCountry> importCountry() {
        List<IqCountry> rankingIQ = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/iq_ranking.txt");
            Scanner sc = new Scanner(fis);
            String line;
            String country;
            String[] a;
            int place;
            String l;
            int iq;

            while (sc.hasNext()) {
                l = sc.nextLine().strip();
                a = l.split(",");
                country = a[1].strip();
                place = Integer.parseInt(a[0].strip());
                iq = Integer.parseInt(a[2].strip());
                IqCountry c = new IqCountry(country, place, iq);
                rankingIQ.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return rankingIQ;
    }
}




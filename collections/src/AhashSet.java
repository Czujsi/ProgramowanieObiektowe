import java.util.LinkedHashSet;

public class AhashSet {
    public static void main(String[] args) {
        System.out.println("------------Hash Set----------");
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Texas");
        hashSet.add("Oklahoma");
        hashSet.add("Wyoming");
        hashSet.add("Tennessee");
        hashSet.add("Florida");
        System.out.println(hashSet);
        hashSet.add("Florida");
        System.out.println(" drugi raz wpisana Floryda ");
        System.out.println(hashSet);
    }
}

public class ArrExp {
    public static void main(String[] args) {
        System.out.println(" ------------------ Array bound exception ------------------");
        int[] a = new int[2];
        System.out.println("Rozmiar tablicy " + a.length);
        a[0] = 12;
        a[1] =5;
        System.out.println(a[0] + a[1]);
        try{
            a[2] = 11;
        }catch (Exception e){
            System.out.println(e);
        }
        a[2] = 11;
    }
}

public class Cinema {
    public static void main(String[] args) {
        final int CL_MID = 12;//dzieci | od 12 nastolatki | od 18 dorośli
        final int CL_MAX =18;
        int age =10;
        int cinema_limit =7;
        int[][] agecin = {{7, 11}, {14, 11}, {22, 11}, {7, 17}, {14, 17}, {22, 17}, {7, 18}, {14, 18}, {22, 18}};
        for (int[] a : agecin) {
            age = a[0];
            cinema_limit = a[1];
        if (cinema_limit<CL_MID) {
            System.out.println("Witamy na seansie , wiek " + age);
        } else if (cinema_limit < CL_MAX){
            if(age > CL_MID) {
                System.out.println("Witamy na seansie, wiek " + age);
            }else{
                System.out.println("Niestety nie jesteś upoważniony, wiek "+age);
            }
        }
        else {
            if (age > CL_MAX) {
                System.out.println("Witamy na seansie, wiek " + age);
            } else {
                System.out.println("Niestety nie jesteś upoważniony, wiek " + age);
            }
        }
            }


        /*int wiek = 12;
        int WiekFilm = 16;
                if(wiek>=WiekFilm){
                    System.out.println("Miłego seansu");
                } else{
                    System.out.println("Jesteś za młody, nie możesz wejść na ten film.");
                }
        */
    }
}
/*
Mniej niz 12 lat
nastolatkowie do 18
dorosli od 18
 */
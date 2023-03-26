import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        System.out.println("--------- Grade : punkty na oceny");
        int punkty;
        Scanner input = new Scanner(System.in);
        System.out.printf("Podaj punkty : ");
        punkty = input.nextInt();
        System.out.println(punkty);
        System.out.println(getGrade(punkty));
        /*
        0-50pkt ocena 2
        51-60pkt ocena 3
        61-70pkt ocema 3+ 3.5
        71-80pkt ocena 4
        81-90pkt ocena 4+
        91-100pkt ocena 5
         */
    }
    public static double getGrade(int punkty){
        double ocena;
        if(punkty>=51 && punkty<=60)
            ocena = 3;
        else if(punkty>=61 && punkty<=70)
            ocena = 3.5;
        else if(punkty>=71 && punkty<=80)
            ocena = 4;
        else if(punkty>=81 && punkty<=90)
            ocena = 4.5;
        else if(punkty>=91 && punkty<=100)
            ocena = 5;
        else
            ocena = 2;

        return ocena;
    }
}

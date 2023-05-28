public class DivExp {
    public static void main(String[] args) {
        System.out.println("---------------- divide by zero --------------");
        int x,y;
        x = 10;
        y =0;
        try {
            float divisionX = x/y;
            System.out.println(divisionX);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Nie można dzielić przez zero!");

        }

    }
}

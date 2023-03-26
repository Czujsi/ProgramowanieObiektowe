public class exampleOverloading {
    public static void main(String[] args) {
        System.out.println("---------ExampleOverloading------------");
        int a = 4;
        int b = 11;
        double c = 12.34;
        double d = 65.12;
        int result = minFunc(a, b);
        double result2 = minFunc(c, d);
        System.out.printf("min %.2f i %.2f wynosi %.2f ",c,d,result2);
        System.out.printf("\n min %d i %d to wynosi %d", a, b, result);
        String stra = "Ala ma kota ";
        String strt = " Wabi się filemon. ";
        String result3 = minFunc(stra,strt);
        System.out.println("\n " + result3);

    }
    public static String minFunc(String s1, String s2){
        String cs = s1 +s2;
        return cs;
    }
    public static double minFunc(double n1, double n2) {
        double min;
        if (n1 < n2)
            min = n1;
        else min = n2;
        return min;
    }

    public static int minFunc(int n1, int n2) {
        int min;
        if (n1 < n2)
            min = n1;
        else min = n2;
        return min;
    }
}

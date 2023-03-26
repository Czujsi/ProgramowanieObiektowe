public class TestEntrance {
    public static void main(String[] args) {
        System.out.println("--------TestEntrance---------");
        int age;
        int cinemaLimit;
        int[][] agecin = {{7, 11}, {14, 11}, {22, 11}, {7, 17}, {14, 17}, {22, 17}, {7, 18}, {14, 18}, {22, 18}};
        for (int[] a : agecin) {
            age = a[0];
            cinemaLimit = a[1];
            System.out.println("age -> cinema " + age + "->" + cinemaLimit);
        }
    }
}

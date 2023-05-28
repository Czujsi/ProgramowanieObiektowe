public class Main {
    public static void main(String[] args) {

        System.out.println("--------- Interface PrintService ---------");
        ImagePrinter ip = new ImagePrinter();
        CardPrinter cp = new CardPrinter();
        DocumentPrinter dp = new DocumentPrinter();
        ip.print();
        cp.print();
        dp.print();
        /*
        Interface PrintService oferuje metode public void print();
        DocumentPrinter
        CardPrinter
        ImagePrinter
         */
    }
}
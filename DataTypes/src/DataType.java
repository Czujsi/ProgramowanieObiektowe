public class DataType {
    public static void main(String[] args) {
        System.out.println("typy danych");

        int hisint = 10;
        int herint =22;
        float hisfloat = 123.456789f;
        double herDouble = 9876.123456;
        boolean myBool = true;
        char myChar = 'c';
        String he ="Adam";
        String she = "Ewa";
        System.out.println("hisInt " + hisint);
        System.out.println("herInt " + herint);
        System.out.println("hisfloat " + hisfloat);
        System.out.println("herDouble " + herDouble);
        System.out.println("myBool " + myBool);
        System.out.println("myChar " + myChar);
        System.out.println(she + " i " + he + " are friends");
        System.out.printf("%s i %s bought car ",she,he,hisfloat+herDouble);
    }
}

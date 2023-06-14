public class Main {
    public static void main(String[] args) {
        System.out.println("--------------Enkapsulacja--------------");
        Student student = new Student();
        student.setName("Adam Abacki");
        student.setAdress("Karmazynowa 15");
        student.setId(1);
        System.out.println(student);
    }
}
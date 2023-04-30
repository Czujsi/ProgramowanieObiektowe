public class Main {
    public static void main(String[] args) {
        System.out.println("---------abstract Class pet---------");
        Cat cat1 =new Cat("Ruby", 3);
        System.out.println(cat1.getName() + " is  "+ cat1.getAge() + "y. old.");
        cat1.speak();
        Dog dog1 = new Dog("Brutus", 7);
        System.out.println(dog1.getName() + " is " + dog1.getAge() + "y. old.");
        dog1.speak();
        Dog dog2 = new Dog("Burek", 4);
        System.out.println(dog2.getName() + " is " + dog2.getAge() + "y. old.");
        dog2.speak();
        Cat cat2 = new Cat("Zmora", 12);
        System.out.println(cat2.getName() + " is " + cat2.getAge() + "y. old.");
        cat2.speak();
        Person p1 = new Person("Alicja Śliczna");
        p1.setPet(cat1);
        System.out.println(p1.getPet().getName() + " ma opiekuna " + p1.name);
        Person p2 = new Person("Janusz Tracz");
        p2.setPet(dog1);
        System.out.println(p2.getPet().getName() + " ma opiekuna " + p2.name);
        Person p3 = new Person("Karol Krawczyk");
        p3.setPet(cat1);
        System.out.println(p3.getPet().getName() + " ma opiekuna " + p3.name);
        Person p4 = new Person("Tadeusz Norek");
        p4.setPet(dog2);
        System.out.println(p4.getPet().getName() + " ma opiekuna " + p4.name);
        Clinic c1 = new Clinic("VetClinic");
        c1.setPet(dog2);
        System.out.println(c1.getPet().getName() + " należy do kliniki " + c1.klinika);


    }
}
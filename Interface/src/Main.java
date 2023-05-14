public class Main {
    public static void main(String[] args) {
        System.out.println("-------Interface---------");
        Dog dog = new Dog("Gustaw", 4);
        System.out.println(dog.name + " ma lat " + dog.age);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.speak();
        Cat cat = new Cat("Kot", 6);
        System.out.println(cat.name + " ma lat " + cat.age);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        cat.speak();
    }
}
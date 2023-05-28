public class Main {
    public static void main(String[] args) {
        System.out.println("----------Polimorphism------------");
        Osoba osoba = new Osoba();
        osoba.imie = "Kasia";
        osoba.nazwisko = "Kowalska";
        System.out.println(osoba);
        Pracownik p = new Pracownik();
        p.imie = "Janusz";
        p.nazwisko = "Polakowski";
        p.zawod = "Górnik";
        System.out.println(p);
    }
}
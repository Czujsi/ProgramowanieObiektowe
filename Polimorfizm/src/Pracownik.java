public class Pracownik extends Osoba{
    int id;
    String zawod;
    @Override
    public String toString(){
        return "Pracownik :" + imie + " " + nazwisko + " zawód: " + zawod + " id = " + id;
    }
}

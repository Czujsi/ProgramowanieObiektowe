public class Clinic {
    String klinika;
    Pet pet;

    public Clinic(String klinika) {
        this.klinika = klinika;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

public class Main {
    public static void main(String[] args) {

        RadnikPoSatu radnik = new RadnikPoSatu("Ivan", "Ivanovic", "01561984984",
                "100-12345678-11", 500, 150);
        RadnikPoDanu radnik1 = new RadnikPoDanu("Milan", "Petrovic", "45896194984",
                "100-78945612-22", 4000, 22);
        RadnikFiksno radnik2 = new RadnikFiksno("Katarina", "Peric", "15935746022",
                "99-214984892-22", 85000, 1);

        radnik.isplataPlata();
        radnik1.isplataPlata();
        radnik2.isplataPlata();
    }
}
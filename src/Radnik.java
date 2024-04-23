public abstract class Radnik {
    //polja: ime, prezime, jmbg, ziro racun, plata
    protected String firstName;
    protected String lastName;
    protected String identificationNumber;
    protected String accountNumber;
    protected double salary;

    public Radnik(String firstName, String lastName, String identificationNumber, String accountNumber, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
        this.accountNumber = accountNumber;
        this.salary = salary;
    }

    abstract void isplataPlata();
}

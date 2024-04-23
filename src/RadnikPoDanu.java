public class RadnikPoDanu extends Radnik {

    protected double numberOfDays;

    public RadnikPoDanu(String firstName, String lastName, String identificationNumber, String accountNumber, double salary,
                        double numberOfDays) {
        super(firstName, lastName, identificationNumber, accountNumber, salary);
        this.numberOfDays = numberOfDays;
    }

    @Override
    void isplataPlata() {
        double totalSalary = salary * numberOfDays;
        System.out.println("First name : " + firstName + " , Last name : " + lastName + " ,Identification number : " + identificationNumber
                + " , Account number : " + accountNumber + " , Total salary : " + totalSalary + " RSD");
    }
}

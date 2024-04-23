public class RadnikFiksno extends Radnik {

    protected double fixedMonth;

    public RadnikFiksno(String firstName, String lastName, String identificationNumber, String accountNumber, double salary, double fixedMonth) {
        super(firstName, lastName, identificationNumber, accountNumber, salary);
        this.fixedMonth = fixedMonth;
    }

    @Override
    void isplataPlata() {
        double totalSalary = salary * fixedMonth;
        System.out.println("First name : " + firstName + " , Last name : " + lastName + " , Identification number : " + identificationNumber
                + " , Account number : " + accountNumber + " , Total salary : " + totalSalary + " RSD");
    }
}

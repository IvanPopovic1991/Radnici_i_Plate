public class RadnikPoSatu extends Radnik {

    protected double hours;

    public RadnikPoSatu(String firstName, String lastName, String identificationNumber, String accountNumber, double salary,
                        double hours) {
        super(firstName, lastName, identificationNumber, accountNumber, salary);
        this.hours = hours;
    }

    @Override
    void isplataPlata() {
        double totalSalary = hours * salary;
        System.out.println("First name : " + firstName + " , Last name : " + lastName + " , Identification number : " + identificationNumber
                + ", Account number : " + accountNumber + " , Total Salary : " + totalSalary + " RSD");
    }
}

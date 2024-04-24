public abstract class Worker {
    protected String firstName, lastName, identificationNumber, accountNumber;

    protected double salary;

    public Worker(String firstName, String lastName, String identificationNumber, String accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
        this.accountNumber = accountNumber;
    }

    protected void paySalary() {
        System.out.println("Worker " + firstName + " " + lastName + " received on " + "account number " + identificationNumber + " " + salary + " RSD");
    }
}

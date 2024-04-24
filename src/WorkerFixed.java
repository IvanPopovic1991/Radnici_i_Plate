public class WorkerFixed extends Worker {


    public WorkerFixed(String firstName, String lastName, String identificationNumber, String accountNumber, double salary) {
        super(firstName, lastName, identificationNumber, accountNumber);
        this.salary = salary;
    }

    @Override
    protected void paySalary() {
        super.paySalary();
    }
}

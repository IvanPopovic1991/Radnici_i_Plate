public class WorkerPerDay extends Worker {

    protected double numberOfDays, salaryPerDay;

    public WorkerPerDay(String firstName, String lastName, String identificationNumber, String accountNumber, double salaryPerDay,
                        double numberOfDays) {
        super(firstName, lastName, identificationNumber, accountNumber);
        this.salaryPerDay = salaryPerDay;
        this.numberOfDays = numberOfDays;
    }

    private double calculateSalary() {
        return numberOfDays * salaryPerDay;
    }

    @Override
    protected void paySalary() {
        salary = calculateSalary();
        super.paySalary();
    }
}

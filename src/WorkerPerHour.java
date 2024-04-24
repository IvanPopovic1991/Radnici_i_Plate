public class WorkerPerHour extends Worker {

    private double hours, salaryPerHour;

    public WorkerPerHour(String firstName, String lastName, String identificationNumber, String accountNumber, double salaryPerHour,
                         double hours) {
        super(firstName, lastName, identificationNumber, accountNumber);
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }

    private double calculateSalary() {
        return hours * salaryPerHour;
    }

    @Override
    public void paySalary() {
        salary = calculateSalary();
        super.paySalary();
    }
}

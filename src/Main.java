public class Main {
    public static void main(String[] args) {

        WorkerPerHour worker = new WorkerPerHour("Ivan", "Ivanovic", "01561984984",
                "100-12345678-11", 500, 150);
        WorkerPerDay worker1 = new WorkerPerDay("Milan", "Petrovic", "45896194984",
                "100-78945612-22", 4000, 22);
        WorkerFixed worker2 = new WorkerFixed("Katarina", "Peric", "15935746022",
                "99-214984892-22", 85000);

        worker.paySalary();
        worker1.paySalary();
        worker2.paySalary();

    }
}
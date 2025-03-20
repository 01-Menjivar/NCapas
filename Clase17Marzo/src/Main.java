public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Oscar", 21, "Calle Mexico", "example@gmail.com", "76754065", "employee");
        Customer c = new Customer("Oscar", 21, "Calle Mexico", "example@gmail.com", "76754065", "customer");

        e.saveMessage();
        c.saveMessage();

    }
}
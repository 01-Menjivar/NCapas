public class Employee extends Person {
    public Employee(String name, int age, String address, String email, String phone, String type) {
        super(name, age, address, email, phone, type);
    }

    @Override
    public void saveMessage(){
        System.out.println("Employee has been saved!");
    }

}

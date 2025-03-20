public class Customer extends Person {
    public Customer(String name, int age, String address, String email, String phone, String type) {
        super(name, age, address, email, phone, type);
    }

    @Override
    public void saveMessage(){
        System.out.println("Customer has been saved!");
    }

}
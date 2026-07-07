package app;

public class Main {

    static void main(String[] args) {

        User userTom = new User("Tom", "Cruise", null);
        Address address = new Address("Nova", 5, 26);

        userTom.setAddress(address);

        System.out.printf("%s lives at the following address: ", userTom.getName());
        System.out.println(userTom.getAddress().printAddress());
    }
}

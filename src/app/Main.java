package app;

public class Main {

    static void main(String[] args) {

        Address address = new Address("Nova", 5, 26);
        User userTom = new User("Tom", "Cruise", address);

        System.out.printf("%s lives at the following address: ", userTom.getName());
        System.out.println(userTom.getAddress().formatAddress());

        Address newAddress = new Address("Shevchenko", 3, 8);
        userTom.setAddress(newAddress);

        System.out.printf("%s lives at the following address: ", userTom.getName());
        System.out.println(userTom.getAddress().formatAddress());
    }
}

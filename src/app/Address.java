package app;

public class Address {

    private String street;
    private int building;
    private int apartment;

    public Address(String street, int building, int apartment) {
        this.street = street;
        this.building = building;
        this.apartment = apartment;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String printAddress() {
        return String.format("%d %s Street, Apartment %d", building, street, apartment);
    }
}

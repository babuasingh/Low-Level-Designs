package Food_Delivery_System.entities;

public class Address {
    private String city;
    private String state;
    private double latitude;
    private double longitude;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public double compareAbsoluteDistance(Address other) {
        // some logic based for comparing distance
        return 0.0;
    }

    public String getCity() {
        return city;
    }

}

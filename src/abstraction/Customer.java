package abstraction;

public abstract class Customer {
    private String name;
    private String address;

//    getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String getCustomerInfo(); // Abstract method
}

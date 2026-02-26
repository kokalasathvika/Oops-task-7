class Delivery {
    String customerName;
    String address;

    void setDetails(String name, String addr) {
        customerName = name;
        address = addr;
    }

    void displayDelivery() {
        System.out.println("Delivery Details");
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        delivery.setDetails("Suman", "Hyderabad");
        delivery.displayDelivery();
    }
}
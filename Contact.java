class Contact {
    String name;
    String phone;

    void setContact(String n, String p) {
        name = n;
        phone = p;
    }

    void displayContact() {
        System.out.println("Contact Saved");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.setContact("Anita", "9876543210");
        contact.displayContact();
    }
}
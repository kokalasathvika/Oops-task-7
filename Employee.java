class Employee {
    String name;
    String id;
    String department;

    void setDetails(String n, String i, String d) {
        name = n;
        id = i;
        department = d;
    }

    void displayIDCard() {
        System.out.println("Employee ID Card");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setDetails("Rahul", "EMP102", "IT");
        emp.displayIDCard();
    }
}
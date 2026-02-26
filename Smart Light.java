class SmartLight {
    String lightName;
    String status;

    void setDetails(String name, String action) {
        lightName = name;
        status = action;
    }

    void displayStatus() {
        System.out.println(lightName + " is " + status);
    }

    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        light.setDetails("Bedroom Light", "ON");
        light.displayStatus();
    }
}
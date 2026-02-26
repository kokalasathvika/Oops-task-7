class Product {
    String productName;
    int price;

    void setProduct(String name, int p) {
        productName = name;
        price = p;
    }

    void displayPriceTag() {
        System.out.println("Product: " + productName);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.setProduct("Headphones", 2499);
        product.displayPriceTag();
    }
}
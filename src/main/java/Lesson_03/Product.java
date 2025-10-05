package Lesson_03;

public class Product {
    String name;
    String dateCreated;
    String manufacturerName;
    String countryCreated;
    double price;
    boolean status;

    public Product(String name, String dateCreated, String manufacturerName, String countryCreated, double price, boolean status) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.manufacturerName = manufacturerName;
        this.countryCreated = countryCreated;
        this.price = price;
        this.status = status;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getCountryCreated() {
        return countryCreated;
    }

    public double getPrice() {
        return price;
    }

    public boolean isStatus() {
        return status;
    }

    public void printProduct(Product product){
        System.out.println("Название продукта: " + product.getName() + ". Дата производства: " + product.getDateCreated() +
                ". Производитель: " + product.getManufacturerName()
        + ". Страна происхождения: " + product.getCountryCreated() + ". Цена: " + product.getPrice() +
                ". Состояние бронирования покупателем: " + product.isStatus() +"." );
    }

    public Product[] createFiveProducts(){
        Product[] productsArr = new Product[5];

        productsArr[0] = new Product("First Product", "05-10-2025", "IntelliJIDE", "Russia", 100, true);
        productsArr[1] = new Product("Second Product", "05-10-2025", "IntellijIDE", "Russia", 99.99, true);
        productsArr[2] = new Product("Third Product", "05-10-2025", "IntellijIDE", "Russia", 0, false);
        productsArr[3] = new Product("Fourth Product", "05-10-2025", "IntellijIDE", "Russia", 101.01, true);
        productsArr[4] = new Product("Fifth Product", "05-10-2025", "IntellijIDE", "Russia", 25.43, false);

        return productsArr;
    }
}

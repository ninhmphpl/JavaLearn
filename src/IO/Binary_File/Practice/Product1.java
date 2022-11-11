package IO.Binary_File.Practice;

import java.io.Serializable;

public class Product1 implements Serializable {
    private String code;
    private String name;
    private String brand;
    private int price;

    @Override
    public String toString() {
        return "Product1{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}' + '\n';
    }

    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product1(String code, String name, String brand, int price, String description) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public Product1() {
    }
}

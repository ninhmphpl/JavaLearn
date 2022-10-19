package MiniTest.Week8.AbstractExercise;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Material implements Discount {
    String id;
    String name;
    LocalDate manufacturingDate;
    LocalDate expiryDate;
    int cost;
    double discount;

    public Material(String id, String name, LocalDate manufacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
        this.expiryDate = getExpiryDate();
    }

    public Material() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();

    public int numberOfDayUntilExpiration (){
        return  expiryDate.getDayOfYear() - LocalDate.now().getDayOfYear();
    }
    public abstract double getPrice();

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", expiryDate=" + expiryDate +
                ", cost=" + cost +
                ", discount=" + discount +
                ", Price=" + getPrice() +
                ", Really Price= " + getRealMoney() +
                '}';
    }
}

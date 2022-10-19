package MiniTest.Week8.AbstractExercise;

import java.time.LocalDate;

public class Meat extends Material{
    double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost) {
        super(id, name, manufacturingDate, cost);
        this.setDiscount(0.1);
    }

    public Meat() {
    }

    @Override
    public double getAmount() {
        return weight * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }

    @Override
    public double getPrice() {
        double price;

        if(this.numberOfDayUntilExpiration()>5){
            price = cost*0.9;
        } else if (this.numberOfDayUntilExpiration()>0) {
            price = cost*0.7;
        } else {
            price = 0;
        }
        return price;
    }

    @Override
    public double getRealMoney() {
        return getPrice() * (1+getDiscount());
    }
}

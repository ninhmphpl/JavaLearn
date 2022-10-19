package MiniTest.Week8.AbstractExercise;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost) {
        super(id, name, manufacturingDate, cost);
        this.setDiscount(0.05);
    }

    public CrispyFlour() {
    }

    @Override
    public double getAmount() {
        return this.quantity * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.manufacturingDate.plusYears(1);
    }

    @Override
    public double getPrice() {
        double price;
        if(numberOfDayUntilExpiration() > 120){
            price = cost;
        }else if (numberOfDayUntilExpiration() > 60){
            price = cost * 0.8;
        } else if (numberOfDayUntilExpiration() > 0) {
            price = cost * 0.6;
        } else {
            price = 0;
        }


        return price;
    }

    @Override
    public double getRealMoney() {
        return getPrice()*(1+getDiscount());
    }
}

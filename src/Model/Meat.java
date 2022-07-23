package Model;

import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat() {
    }

    public Meat(String id, String name, String manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight*this.getCost();
    }

    @Override
    public LocalDate getExpireDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        if (now.minusDays(5).isAfter(getExpireDate())){
            return getAmount()*70/100; // giảm 30%
        } else
            return getAmount()*90/100; // giảm 10%
    }

    @Override
    public String toString() {
        return "Meat "+super.toString()+", weight = " +getWeight() ;
    }
}

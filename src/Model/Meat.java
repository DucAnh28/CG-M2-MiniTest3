package Model;

import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight*getCost();
    }

    @Override
    public LocalDate getExpireDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        if (now.minusDays(5).isAfter(getExpireDate())){
            return getAmount()*30/100;
        } else
            return getAmount()*10/100;
    }
}

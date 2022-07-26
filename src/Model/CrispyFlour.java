package Model;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, String manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }


    @Override
    public double getAmount() {
        return quantity * this.getCost();
    }

    @Override
    public LocalDate getExpireDate() {
        return getManufacturingDate().plusYears(1);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        if (now.plusMonths(2).isAfter(getExpireDate())) return (getAmount() * 60 / 100); // giảm 40%
        else if (now.plusMonths(4).isAfter(getExpireDate())) return getAmount() * 80 / 100; //giảm 20%
        else return getAmount() * 95 / 100;  // giảm 5%
    }

    @Override
    public String toString() {
        return "Crisp" + super.toString() + ", quantity= " + getQuantity();
    }
}

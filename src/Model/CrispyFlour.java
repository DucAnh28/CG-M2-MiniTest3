package Model;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
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
        if (now.plusMonths(4).isAfter(getExpireDate())) return getAmount() * 20 / 100;
        else if (now.plusMonths(2).isAfter(getExpireDate())) return getAmount() * 40 / 100;
        else return getAmount() * 10 / 100;
    }
}

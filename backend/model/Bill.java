package model;

public class Bill {
    private int userId;
    private int units;
    private double amount;

    public Bill(int userId, int units, double amount) {
        this.userId = userId;
        this.units = units;
        this.amount = amount;
    }

    public int getUserId() { return userId; }
    public int getUnits() { return units; }
    public double getAmount() { return amount; }
}

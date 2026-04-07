package service;

import model.Bill;

public class BillingService {

    public Bill generateBill(int userId, int units) {
        double rate = 5.0;
        double amount = units * rate;

        return new Bill(userId, units, amount);
    }
}

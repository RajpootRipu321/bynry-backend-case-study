package controller;

import service.BillingService;
import model.Bill;

public class BillingController {

    private BillingService billingService = new BillingService();

    public Bill createBill(int userId, int units) {
        return billingService.generateBill(userId, units);
    }
}

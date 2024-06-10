package services;

public interface OnlinePaymentService {

    double paymenFee (double amount);
    double interest(double amount, int months);
}

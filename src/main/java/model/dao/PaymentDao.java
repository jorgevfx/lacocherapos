package model.dao;

import model.models.Payment;

public interface PaymentDao {
    void createPayment(Payment payment);
    void updatePayment(String id);
    void deletePayment(String id);
    void readPayment(String id);
}

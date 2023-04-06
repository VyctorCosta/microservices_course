package com.vyctor.hrpayroll.services;

import com.vyctor.hrpayroll.models.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Charlie", 200.0, days);
    }
}

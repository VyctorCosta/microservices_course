package com.vyctor.hrpayroll.services;

import com.vyctor.hrpayroll.feignclients.WorkerFeignClient;
import com.vyctor.hrpayroll.models.Payment;
import com.vyctor.hrpayroll.models.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days) {
        Worker worker = workerFeignClient.getWorkerById(workerId).getBody();

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}

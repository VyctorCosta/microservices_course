package com.vyctor.hrpayroll.config;

import com.vyctor.hrpayroll.supplier.WorkerInstanceSupplier;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;

public class WorkerServerInstanceConfiguration {
    @Bean
    ServiceInstanceListSupplier serviceInstanceListSupplier() {
        return new WorkerInstanceSupplier("hr-worker");
    }
}

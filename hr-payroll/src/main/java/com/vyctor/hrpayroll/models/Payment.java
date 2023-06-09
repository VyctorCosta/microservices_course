package com.vyctor.hrpayroll.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Double getTotal() {
        return dailyIncome * days;
    }
}

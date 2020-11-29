package com.company;

import com.sun.javaws.exceptions.OfflineLaunchException;

public class BaseEmployee extends CommisionEmployee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, double grossSales, double commisionRate, double baseSalary) {
        super(firstName, lastName, grossSales, commisionRate );
        if (baseSalary <0.0)
            throw new IllegalArgumentException("Base salary must be >=0");
        this.baseSalary = baseSalary;
        }

        public double getBaseSalary () {
        return baseSalary;
        }

    public void setBaseSalary (double baseSalary){
        if(baseSalary<0.0)
            throw new IllegalArgumentException("Base salary must be >=0");
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings () {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}

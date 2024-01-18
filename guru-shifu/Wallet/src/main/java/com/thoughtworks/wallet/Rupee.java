package com.thoughtworks.wallet;

public class Rupee {
    public final double value;

    public Rupee(double amount) throws Exception {
        if (amount < 0)
            throw new Exception();
        this.value = amount;
    }

    public static Rupee add(Rupee rupee1, Rupee rupee2) throws Exception {
        return new Rupee(rupee1.value + rupee2.value);
    }

    @Override
    public boolean equals(Rupee rupee) {
        return rupee.value == this.value;
    }
}

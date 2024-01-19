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
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (!(o.getClass() == getClass()))
            return false;
        Rupee other = (Rupee) o;
        return this.value == other.value;
    }

    @Override
    public final int hashCode() {
        return Double.valueOf(value).hashCode();
    }
}

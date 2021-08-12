package com.company;

import java.util.HashMap;
import java.util.Map;

public class Price {
    private final Map<String, Double> rates;
    private final Double value;

    public Price(Double value) {
        this.value = value;
        rates = new HashMap<String, Double>();
        rates.put("USD", 1d);
        rates.put("GBP", 0.6);
        rates.put("EUR", 0.8);
    }

    public Price(Price price) {
        this.rates = new HashMap<>(price.rates);
        this.value = price.value;
    }

    public Double convert(String toCurrency) {
        Double tmp = value;

        if (toCurrency.equals("USD")) {
            return tmp;
        } else {
            Double conversion = rates.get("USD") / rates.get(toCurrency);
            tmp = conversion * tmp;
            return tmp;
        }
    }

    public String toString() {
        return this.value.toString();
    }

    public Map<String, Double> getRates() {
        return rates;
    }
}
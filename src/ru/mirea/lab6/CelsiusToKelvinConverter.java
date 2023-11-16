package ru.mirea.lab6;

public class CelsiusToKelvinConverter implements Convertible{
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}

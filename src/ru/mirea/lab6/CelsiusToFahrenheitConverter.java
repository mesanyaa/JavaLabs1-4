package ru.mirea.lab6;

public class CelsiusToFahrenheitConverter implements Convertible{
    @Override
    public double convert(double temperature) {
        return (temperature * 9 / 5) + 32;
    }
}

package ru.mirea.lab6;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Convertible celsiusToKelvinConverter = new CelsiusToKelvinConverter();
        Convertible celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();

        Scanner scanner = new Scanner(System.in);
        double celsiusTemperature = scanner.nextDouble();

        double kelvinTemperature = celsiusToKelvinConverter.convert(celsiusTemperature);
        System.out.println(celsiusTemperature + " °C = " + kelvinTemperature + " K");

        double fahrenheitTemperature = celsiusToFahrenheitConverter.convert(celsiusTemperature);
        System.out.println(celsiusTemperature + " °C = " + fahrenheitTemperature + " °F");
    }
}

package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double f = (temperatureCelsius * 9.0 / 5) + 32;
        System.out.println(f);
    }
}

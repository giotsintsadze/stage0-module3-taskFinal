package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float calculatedTemperature = (float) (temperatureCelsius * 9) /5 + 32f;
        System.out.println(calculatedTemperature);
    }

    public static void main(String[] args) {
        TemperatureConverter calc = new TemperatureConverter();
        calc.toFahrenheit(1);
    }
}

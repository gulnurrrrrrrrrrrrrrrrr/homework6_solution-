public class Thermostat {
    private int temperature = 20;
    private int previousTemperature = 20;

    public void setTemperature(int temp) {
        previousTemperature = temperature;
        temperature = temp;
        System.out.println("[Thermostat] Setting temperature to " + temp + "°C");
    }

    public void revertTemperature() {
        int temp = temperature;
        temperature = previousTemperature;
        previousTemperature = temp;
        System.out.println("[Thermostat] Reverting to previous temperature: " + temperature + "°C");
    }
}

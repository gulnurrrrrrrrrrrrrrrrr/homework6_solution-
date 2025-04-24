public class MainCommand {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightCommand = new TurnOnLightCommand(light);
        Command tempCommand = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light", lightCommand);
        remote.setCommand("thermo", tempCommand);

        remote.pressButton("light");
        remote.pressButton("thermo");

        System.out.println("Undo last command");
        remote.undoButton();
    }
}

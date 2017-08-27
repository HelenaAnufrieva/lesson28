package command;

/**
 * Created by User on 8/27/2017.
 */
public class TurnOnLightCommand implements Command {
    private Light theLight;
    public TurnOnLightCommand(Light light) {this.theLight = light;}

    public void execute() {theLight.turnOn();}

}

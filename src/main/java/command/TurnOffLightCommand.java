package command;

/**
 * Created by User on 8/27/2017.
 */
public class TurnOffLightCommand implements Command {
    private Light theLight;
    public TurnOffLightCommand(Light light) {this.theLight = light;}

    public void execute() {theLight.turnOff();}

}

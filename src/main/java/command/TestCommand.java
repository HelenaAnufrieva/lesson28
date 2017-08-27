package command;

/**
 * Created by User on 8/27/2017.
 */
public class TestCommand {
    public static void main(String[] args) {
        Light l = new Light();
        Command switchUp = new TurnOnLightCommand(l);
        Command switchUDown = new TurnOffLightCommand(l);

        Switch s = new Switch(switchUp, switchUDown);
        s.flipUp();
        s.flipDown();

    }
}

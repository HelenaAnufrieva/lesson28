package command;

/**
 * Created by User on 8/27/2017.
 */
public class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;
    public Switch(Command flipUpCommand, Command flipDownCommand)
    {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }
    public void flipUp()
    {
        flipUpCommand.execute();
    }
    public void flipDown()
    {
        flipDownCommand.execute();
    }
}

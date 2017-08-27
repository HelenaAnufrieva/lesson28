package memento;

/**
 * Created by User on 8/27/2017.
 */
public class Memento {
    private String state;

    public Memento (String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }
}

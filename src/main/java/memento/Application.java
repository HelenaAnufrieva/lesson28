package memento;

/**
 * Created by User on 8/27/2017.
 */
public class Application {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("on");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());
        originator.setState("off");
        System.out.printf("State is %s\n", originator.getState());
        originator.restoreState(caretaker.getMemento());
        System.out.printf("State if %s\n", originator.getState());
    }
}

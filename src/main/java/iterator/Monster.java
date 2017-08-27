package iterator;

import java.util.Iterator;

/**
 * Created by User on 8/27/2017.
 */
public class Monster implements Iterable<Monster.Part>{
    public Iterator<Part> iterator() {
        return new MonsterIterator(this);
    }

    interface Part{}
    static class Head implements Part{}
    static class Hand implements Part{}
    static class Leg implements Part{}
    private Head head = new Head();
    private Hand hand = new Hand();
    private Leg leg = new Leg();

    public Head getHead() {
        return head;
    }

    public Hand getHand() {
        return hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public boolean hasHead() {
        return head != null;
    }
    public boolean hasHand() {
        return hand != null;
    }
    public boolean hasLeg() {
        return leg != null;
    }

    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.setHead(null);
        Iterator iterator = new MonsterIterator(monster);

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        iterator.remove();

        System.out.println(iterator.hasNext());
    }
}

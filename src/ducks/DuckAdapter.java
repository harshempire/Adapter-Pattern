package ducks;

import java.util.Random;

public class DuckAdapter implements Turkey{

    Duck duck;
    Random rand;
    public DuckAdapter(Duck duck){
        this.duck=duck;
        rand=new Random();
    }
    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}

package ducks;

import com.sun.media.jfxmediaimpl.HostUtils;

public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Mallard Duck Quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck FLying");
    }
}

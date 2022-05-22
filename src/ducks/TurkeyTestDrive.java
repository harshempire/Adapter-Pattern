package ducks;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck();
        Turkey turkey=new DuckAdapter(mallardDuck);
        turkey.fly();
        turkey.gobble();
    }
}

package ducks;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck=new MallardDuck();
        Turkey turkey=new WildTurkey();
        Duck turkeyadapter=new TurkeyAdapter(turkey);
        turkeyadapter.fly();
        turkeyadapter.quack();
    }
}

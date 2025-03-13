package good;

public class Bird {
    public void makeSound(){
        System.out.println("Bird is making a sound...");
    }
}
class FlyingBird extends Bird{
    public void fly(){
        System.out.println("Flying..");
    }
}
class Sparrow extends FlyingBird{

}
class Penguin extends Bird{
    public void swim(){
        System.out.println("Penguin is swimming...");
    }
}
class Main{
    public static void main(String[] args) {
        FlyingBird sparrow =new Sparrow();
        sparrow.fly();

        Bird penguin =new Penguin();
        penguin.makeSound();
    }
}

package bad;

class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Sparrow extends Bird {

}

class Penguin extends Bird {
    // Penguins cannot fly
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}
class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.fly(); // Works fine

        Bird penguin = new Penguin();
        penguin.fly(); // Throws an error
    }
}

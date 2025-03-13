package good;

interface Worker {
    void work();
}

interface Cook{
    void cook();
}
class Programmer implements Worker{

    @Override
    public void work() {
        System.out.println("Cording");
    }
}
class Chef implements Cook{

    @Override
    public void cook() {
        System.out.println("rice");
    }
}



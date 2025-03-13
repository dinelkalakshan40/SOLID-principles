package bad;

interface Worker {
    void work();
    void eat();
}
class Programmer implements Worker{

    @Override
    public void work() {

    }

    @Override
    public void eat() {//this is not applicable

    }
}

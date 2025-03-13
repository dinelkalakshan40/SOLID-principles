package Good;


interface Developer{
    void develop();
}
class BackendDeveloper implements Developer {
    public void develop() {
        System.out.println("Developing backend...");
    }
}
class FrontendDeveloper implements Developer {
    public void develop() {
        System.out.println("Developing frontend...");
    }
}

class Main{
    public static void main(String[] args) {
        Developer backendDev =new BackendDeveloper();
        Developer frondEndDev = new FrontendDeveloper();

        backendDev.develop();
        frondEndDev.develop();

    }
}

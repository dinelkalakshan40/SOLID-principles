package bad;

class BackendDeveloper {
    void developBackend(){
        System.out.println("Developing backend...");
    }
}
class FrondEndDeveloper{
    void developFrondEnd(){
        System.out.println("Developing frontend...");
    }
}
class Project{
    BackendDeveloper backend =new BackendDeveloper();
    FrondEndDeveloper frondEnd =new FrondEndDeveloper();

    public void develop(){
        backend.developBackend(); //The FrontendDeveloper directly depends on BackendDeveloper.
        frondEnd.developFrondEnd();//
    }
}

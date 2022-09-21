public class EagerInitialization {

    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization()
    {

    }

    public static EagerInitialization getInstance(){
        return instance;
    }

    public void doSomething(){
        EagerInitialization instance1 = EagerInitialization.getInstance();
        EagerInitialization instance2 = EagerInitialization.getInstance();
        System.out.println("Instance 1 : " + instance1.hashCode());
        System.out.println("Instance 2 : " + instance2.hashCode());
    }

}

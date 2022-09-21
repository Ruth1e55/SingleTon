public class LazyInitialization
{
    private static LazyInitialization instance;

    private LazyInitialization()
    {

    }

    public static LazyInitialization getInstance()
    {
        if (instance == null)
        {
            instance = new LazyInitialization();
        }
        return instance;
    }

    public void doSomething(){
        LazyInitialization instance1 = LazyInitialization.getInstance();
        LazyInitialization instance2 = LazyInitialization.getInstance();
        System.out.println("Instance 1 : " + instance1.hashCode());
        System.out.println("Instance 2 : " + instance2.hashCode());
    }
}
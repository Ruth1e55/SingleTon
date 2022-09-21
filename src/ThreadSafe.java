public class ThreadSafe {
    private static ThreadSafe instance;

    private ThreadSafe()
    {

    }

    synchronized public static ThreadSafe getInstance()
    {
        if (instance == null)
        {
            instance = new ThreadSafe();
        }
        return instance;
    }

    public void doSomething(){
        ThreadSafe instance1 = ThreadSafe.getInstance();
        ThreadSafe instance2 = ThreadSafe.getInstance();
        System.out.println("Instance 1 : " + instance1.hashCode());
        System.out.println("Instance 2 : " + instance2.hashCode());
    }
}

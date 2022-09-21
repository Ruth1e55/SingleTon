public class DoubleCheck {
    private static DoubleCheck instance;
    private DoubleCheck() {

    }
    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
    public void doSomething() {
       DoubleCheck instance1 = DoubleCheck.getInstance();
       DoubleCheck instance2 = DoubleCheck.getInstance();
       System.out.println("Instance 1 : " + instance1.hashCode());
       System.out.println("Instance 2 : " + instance2.hashCode());
    }
}

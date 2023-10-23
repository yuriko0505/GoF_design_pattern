package singleton;

public class DelaySingleton {
    private static int InstanceNo = 0;
    private static DelaySingleton instance;
    private DelaySingleton() {
        InstanceNo++;
        System.out.println("DelaySingleton is created: " + InstanceNo);
    }
    public static DelaySingleton getInstance() {
        if (instance == null) {
            System.out.println("DelaySingleton does not exist.");
            instance = new DelaySingleton();  
        } else {
            System.out.println("DelaySingleton already exists: " + InstanceNo);
        }
        return instance;  
    }  
} 
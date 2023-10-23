package singleton;

public class SynchronizedSingleton {
    private static int InstanceNo = 0;
    private static SynchronizedSingleton instance;
    private SynchronizedSingleton() {
        InstanceNo++;
        System.out.println("SynchronizedSingleton is created: " + InstanceNo);
    }
    public static SynchronizedSingleton getInstance(){
        if(instance == null){
            System.out.println("SynchronizedSingleton does not exist.");
            // block the multiple access from multiple thread  
            synchronized (SynchronizedSingleton.class) {  
                // check again, can be non-null,   
                // since the instance already generated just at the process just before   
                if(instance == null){  
                    instance = new SynchronizedSingleton();  
                }  
            }  
        } else {
            System.out.println("SynchronizedSingleton already exists: " + InstanceNo);
        }
        return instance;  
    }
}
package singleton;

public class BillPushSingleton{
    private static int InstanceNo = 0;
    // class to hold the instance as final  
    private class SingletonHolder{  
        // this instance won't be loaded to memory until initial reference  
        // normally, class value will be loaded into memory when the class is loaded to JVM with class loader.  
        private static final BillPushSingleton INSTANCE = new BillPushSingleton();  
    }
    private BillPushSingleton() {
        InstanceNo++;
        System.out.println("BillPushSingleton is created: " + InstanceNo);
    }  
    // method to get the instance  
    public static BillPushSingleton getInstance() {
        if (InstanceNo == 0) {
            System.out.println("BillPushSingleton does not exist.");
        } else {
            System.out.println("BillPushSingleton already exists: " + InstanceNo);
        }
        // this instance will be instantiated at the initial call only.  
        return SingletonHolder.INSTANCE;     
    }  
}
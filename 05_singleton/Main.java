import singleton.NormalSingleton;
import singleton.DelaySingleton;
import singleton.SynchronizedSingleton;
import singleton.BillPushSingleton;
import singleton.EnumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class Main{
    public static void main(String args[]){
        System.out.println("--- Main start ---");
        System.out.println("--- call NormalSingleton.getInstance ---");
        NormalSingleton normalSingleton = NormalSingleton.getInstance();
        System.out.println("--- call DelaySingleton.getInstance ---");
        DelaySingleton delaySingleton = DelaySingleton.getInstance();
        System.out.println("--- call SynchronizedSingleton.getInstance ---");
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        System.out.println("--- call BillPushSingleton.getInstance ---");
        BillPushSingleton billPushSingleton = BillPushSingleton.getInstance();
        System.out.println("--- call EnumSingleton ---");
        EnumSingleton enumSingleton = EnumSingleton.getInstance();

        // reflection
        System.out.println("--- reflection ---");
        try {
            Class<?> normalSingletonClass = Class.forName("singleton.NormalSingleton");
            
            // private なコンストラクタにアクセス
            Constructor<?>[] normalSingletonConstructors = normalSingletonClass.getDeclaredConstructors();
            for (Constructor<?> constructor : normalSingletonConstructors) {
                constructor.setAccessible(true);
            }

            Object normalSingletonInstance = normalSingletonConstructors[0].newInstance();
            Method normalSingletonMethod = normalSingletonClass.getDeclaredMethod("getInstance");
            normalSingletonMethod.invoke(normalSingletonInstance);

            Class<?> enumSingletonClass = Class.forName("singleton.EnumSingleton");
            Constructor<?>[] enumSingletonConstructors = enumSingletonClass.getDeclaredConstructors();
            for (Constructor<?> constructor : enumSingletonConstructors) {
                constructor.setAccessible(true);
            }
            // IllegalArgumentException: Cannot reflectively create enum objects
            Object enumSingletonInstance = enumSingletonConstructors[0].newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
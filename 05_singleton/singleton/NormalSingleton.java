package singleton;

public class NormalSingleton {
	private static int InstanceNo = 0;
	private static NormalSingleton INSTANCE = new NormalSingleton();
	private NormalSingleton(){
		InstanceNo++;
		System.out.println("NormalSingleton is created: " + InstanceNo);
	}  // private constructor
	public static NormalSingleton getInstance(){
		if (INSTANCE == null){
			System.out.println("NormalSingleton does not exist.");
			INSTANCE = new NormalSingleton();
		} else {
			System.out.println("NormalSingleton already exists: " + InstanceNo);
		}
		return INSTANCE;
	}
}
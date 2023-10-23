package singleton;

public enum EnumSingleton {
    // enum with only one element.  
    // this element will act as same with instance of other impl pattern.  
    INSTANCE("Now it is clear for you to see this is singleton, ahh??");  
    // Constructor to make this sample code looks like class.  
    // this constructor is unable to be called even from reflection as Java lang spec.  
    private EnumSingleton(String dummyMessage) {
        System.out.println("EnumSingleton is created.");
        this.dummyMessage = dummyMessage;  
    }  
    // dummy filed to make this sample code look like the other impl pattern  
    private String dummyMessage;
    // dummy method to show this enum can work like normal class.  
    public static EnumSingleton getInstance() {
        if (INSTANCE == null) {
            System.out.println("EnumSingleton does not exist.");
        } else {
            System.out.println("EnumSingleton already exists.");
        }
        return INSTANCE;
    }
}
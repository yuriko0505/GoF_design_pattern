import prototype.*;

public class Main {
    public static void main(String[] args) {
        // 準備
        Manager manager = new Manager();
        Underline ul = new Underline('~');
        MessageBox mbox = new MessageBox('@');
        MessageBox sbox = new MessageBox('♪');

        manager.register("strong message", ul);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成
        Product p1 = manager.create("strong message");
        p1.use("Git Hub");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Java");
    }
}
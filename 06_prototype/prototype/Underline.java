package prototype;

public class Underline implements Product {
    private char ulChar;
    public Underline(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String string) {
        int length = string.getBytes().length;
        System.out.println(string);
        for (int i=0; i<length; i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
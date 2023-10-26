package prototype;

public class MessageBox implements Product {
    private char decoChar;
    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String string) {
        int length = string.getBytes().length;
        for (int i=0; i<length+4; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
        System.out.println(decoChar + " " + string + " " + decoChar);
        for (int i=0; i<length+4; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            // cloneメソッドはObjectクラスに定義されている
            // そのため、CloneNotSupportedExceptionをcatchする必要がある
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
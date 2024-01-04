public class OOPS {
    int x;

    private int secret=10;

    public int getSecret(){
        return secret;
    }
    public OOPS() {
        x = 6;
    }

    public OOPS(int y) {
        if (y == 9)
            x = 9;
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        OOPS obj = new OOPS();
        System.out.println(obj.x);
    }
}

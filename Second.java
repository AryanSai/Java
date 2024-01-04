public class Second {
    public static void main(String[] args) {
        OOPS.staticMethod();
        OOPS obj = new OOPS();
        System.out.println(obj.x);
        obj.publicMethod();

        OOPS obj2 = new OOPS(9);
        System.out.println(obj2.x);

        System.out.println(obj2.getSecret());
    }
}

class Wrapperrr{
    public static void main(String[] args){

        //autoboxing
        int x=5;
        Integer obj = x;
        System.out.println(obj.intValue());
        System.out.println(Integer.MAX_VALUE);
        int y= Integer.parseInt("2");
        System.out.println(y);
        System.out.println(((Object)y).getClass().getSimpleName());


        //unboxing
        Integer a =2;
        int aa=a;
        Integer b =2;
        System.out.println(a+b);

        Integer xx = 5;
        Character yy = 'x';
        Double z = 2.1;

        System.out.println(xx + yy + z);


    }
}
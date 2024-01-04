class Vehicle {
    protected String brand = "ford";

    public void honk() {
        System.out.println("honk honk!!");
    }
}

class Car extends Vehicle {
    private String model = "figo";

    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.honk();
        System.out.println(mycar.brand+" "+mycar.model);
    }

}

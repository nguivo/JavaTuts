public class T005InheritVehicle {
    protected String brand = "ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }

}


class Car extends T005InheritVehicle {
    private String modelName = "Mustang";  // car attribute

    public String getModelName(){
        return this.modelName;
    }

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.honk();
        System.out.println(myCar.modelName);
    }
}

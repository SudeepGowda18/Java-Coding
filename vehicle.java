public class vehicle {
    public void start()
    {
        System.out.println("vehicle starts");
    }

    static class Car extends vehicle {
        public void drive() {
            System.out.println("car is driving");
        }
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}

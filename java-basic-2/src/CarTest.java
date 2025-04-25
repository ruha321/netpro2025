public class CarTest {
    public static void main() {
        Car myCar = new Car();
        myCar.drive(100);
        myCar.stop(5);
        int speed_current = myCar.upSpeed(20);
        System.out.println("Current speed: " + speed_current);
        speed_current = myCar.downSpeed(10);
        System.out.println("Current speed: " + speed_current);
    }

}

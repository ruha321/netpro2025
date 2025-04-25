public class Car implements Drivable {
    private int speed;

    @Override
    public void drive(int speed) {
        this.speed = speed;
        System.out.println("Driving at " + this.speed + " kilometers per hour.");
    }

    @Override
    public void stop(int withintime) {
        System.out.println("Stopping the car...");
        try {
            Thread.sleep(withintime * 1000); // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.speed = 0;
        System.out.println("Stopped the car within " + withintime + " seconds.");
    }

    @Override
    public int upSpeed(int upspeed) {
        this.speed += upspeed;
        System.out.println("Speed increased by " + upspeed + " kilometers per hour.");
        return this.speed;
    }
    @Override
    public int downSpeed(int dwnSpeed) {
        this.speed -= dwnSpeed;
        System.out.println("Speed decreased by " + dwnSpeed + " kilometers per hour.");
        return this.speed;
    }
}

// Direction Enum having two states either going forward and backward
enum FanDirection {
    FORWARD, BACKWARD
}

// CeilingFan class
class CeilingFan {

    private int DEFAULT_SPEED = 0;
    private int MAX_SPEED = 3;

    private int speed = DEFAULT_SPEED; // Default Speed
    private FanDirection fanDirection = FanDirection.FORWARD; // Default direction

    // Constructors
    public CeilingFan() {}

    public CeilingFan(int speed, FanDirection fanDirection) {
        this.speed = speed;
        this.fanDirection = fanDirection;
    }

    // Increase Speed method
    public void increaseSpeed() {
        if (speed == MAX_SPEED)
            speed = DEFAULT_SPEED;
        else
            speed++;
    }

    // Reverse Direction Method
    public void reverseFanDirection() {
        if(fanDirection == FanDirection.FORWARD)
            fanDirection = FanDirection.BACKWARD;
        else
            fanDirection = FanDirection.FORWARD;
    }

    // Getters and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public FanDirection getFanDirection() {
        return fanDirection;
    }

    public void setFanDirection(FanDirection fanDirection) {
        this.fanDirection = fanDirection;
    }

    // toString method
    @Override
    public String toString() {
        return "CeilingFan{" +
                "speed=" + speed +
                ", fanDirection=" + fanDirection +
                '}';
    }
}

// Main Class
public class Main {

    // Testing the code
    public static void main(String[] args) {
        CeilingFan cielingFan = new CeilingFan();
        System.out.println(cielingFan.toString());
        cielingFan.increaseSpeed();
        System.out.println(cielingFan.toString());
        cielingFan.increaseSpeed();
        System.out.println(cielingFan.toString());
        cielingFan.increaseSpeed();
        System.out.println(cielingFan.toString());
        cielingFan.increaseSpeed();
        System.out.println(cielingFan.toString());
        cielingFan.reverseFanDirection();
        System.out.println(cielingFan.toString());
        cielingFan.increaseSpeed();
        System.out.println(cielingFan.toString());
        cielingFan.increaseSpeed();
        System.out.println(cielingFan.toString());
        cielingFan.increaseSpeed();
        System.out.println(cielingFan.toString());
        cielingFan.increaseSpeed();
        System.out.println(cielingFan.toString());
    }
}

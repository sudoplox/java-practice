import java.lang.ref.WeakReference;
import java.util.Arrays;

class Car {
    int speed;
    int acceleration;
    public Car(int speed) {
        this.speed = speed;
        Arrays.sort(new int[]{1,2});
    }
    public void setAcceleration() {
        acceleration += speed;
    }
}

class Toyota extends Car {
    public Toyota(int speed) {
        super(speed);
    }
    public void setAcceleration() {}
}

class Honda extends Car {
    public Honda(int speed) {
        super(speed);
    }
    public void setAcceleration() {}
    public void getSpeed() {
        System.out.println("Speed: " + speed);
        System.out.println((double)0.7f);
        System.out.println((double)4.125f);
    }
}

class Hyundai extends Car {
    public Hyundai(int speed) {
        super(speed);
    }
    public void setAcceleration() {}
    public void getSpeed() {
        System.out.println("Speed: " + speed);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Heyy");
        Car car = new Car(100);

        // if we create a strong reference to car, it will not be garbage collected when we call System.gc()
        Toyota toyota = new Toyota(120); // strong reference

        // if we create a weak reference to toyota, it will be garbage collected when we call System.gc()
        WeakReference<Toyota> toyotaWeakReference = new WeakReference<>(toyota); // weak reference

        Honda honda = new Honda(140);
        honda.getSpeed();
        System.gc();
        toyota.setAcceleration();
    }

}
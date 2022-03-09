package midterm;

public class Car extends Vehicle {
    boolean isLeftHandDriving;

    // getter and setter
    public boolean isLeftHandDriving() {
        return isLeftHandDriving;
    }

    public void setLeftHandDriving(boolean leftHandDriving) {
        isLeftHandDriving = leftHandDriving;
    }

    // constructor


    public Car(String productId, Integer weight, boolean isLeftHandDriving) {
        super(productId, weight);
        this.isLeftHandDriving = isLeftHandDriving;
    }



    @Override
    public void accelerate() {
        if (getWeight() == null) {
            System.out.println("there’s something wrong");
        } else{
            System.out.println("fire pistons, turn wheels");
        }

    }

    @Override
    public void steerLeft() {
        System.out.println("turn wheels left");

    }

    @Override
    public void steerRight() {
        System.out.println("turn wheels right");

    }

    @Override
    public String toString() {
        return "Car{" +
                "productId='" + super.getProductId() + '\'' +
                ", weight=" + super.getWeight() + '\'' +
                "isLeftHandDriving=" + isLeftHandDriving +
                '}';
    }
}

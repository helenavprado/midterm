package midterm;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Car c1 = new Car("c1", 250, true);
        Car c2 = new Car("c2", 220, true);
        Car c3 = new Car("c3", -210, false);

        Boat b1 = new Boat("b1", 500);
        Boat b2 = new Boat("b2", 700);
        Boat b3 = new Boat("b3", 800);

        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(c3);
        vehicles.add(b1);
        vehicles.add(b2);
        vehicles.add(b3);

        for (int i = 0; i <= vehicles.size() -1; i++) {
            System.out.println(vehicles.get(i));
        }

        c1.accelerate();
        c2.accelerate();
        c3.accelerate();
        b1.accelerate();
        b2.accelerate();
        b3.accelerate();


    }
}

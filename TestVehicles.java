package ass3;

/**
 * Created by mihir on 09-05-2017.
 */
public class TestVehicles {


        public static void main(String [] args){

            Car c = new Car("BMW", "X6", 2016);

            racingcar rc = new racingcar("Ferrari", "488 GTB", 2010);

            Truck truck = new Truck("Ford", "F150", 2008, 0.5);

            Motorbike mb = new Motorbike("Suzuki", "Hayabusa", 2015);


            System.out.println(" Car");
            c.print();
            System.out.println(" ");
            System.out.println(" Racing Car");
            rc.print();
            System.out.println(" ");
            System.out.println(" Truck");
            truck.print();
            System.out.println(" ");
            System.out.println(" MotorBike");
            mb.print();


        }
    }


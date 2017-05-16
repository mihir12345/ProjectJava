package ass3;

/**
 * Created by mihir on 09-05-2017.
 */
public class runnable {

        public static void main(String args[]) {

            Runnable task = new Task();
            task.run(); //call overridden method in Task

            task = new PeriodicTask();
            task.run(); //calls overridden method in PeriodicTas
        }
    }

    class Task implements Runnable{
        @Override
        public void run() {
            System.out.println("Run method overridden in Task class");
        }

    }

    class PeriodicTask extends Task{
        @Override
        public void run() {
            System.err.println("overridden method run() in PeriodicTask class");
        }

    }

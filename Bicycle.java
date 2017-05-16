/**
 * Created by mihir on 09-05-2017.
 */
public class Bicycle {


        public int cadence;
        private int gear;
        private int speed;
        protected int bell;

        public Bicycle(int startCadence, int startSpeed, int startGear,int ringbell) {
            gear = startGear;
            cadence = startCadence;
            speed = startSpeed;
            bell = ringbell;
        }

        public int getCadence() {
            return cadence;
        }

        public void setCadence(int newValue) {
            cadence = newValue;
        }

        private int getGear() {
            return gear;
        }

        private void setGear(int newValue) {
            gear = newValue;
        }

        protected int getbell(){
            return bell;
        }

        protected void setbell(int newValue){
            bell=newValue;
        }

        public int getSpeed() {
            return speed;
        }

        public void applyBrake(int decrement) {
            speed -= decrement;
        }

        public void speedUp(int increment) {
            speed += increment;
        }

    }



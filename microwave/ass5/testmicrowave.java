/**
 * Created by mihir on 19-04-2017.
 */
public class testmicrowave {

    static void turn(Device d, boolean on) {
        if (on)
            d.turnOn();
        else
            d.turnOff();
    }

    public static void main(String[] args) {
        microwave ovan = new samsung550();

        turn((Device) ovan, true);

        ovan.inctemperatue(3);
        ovan.inctime(4);
        ovan.setwavelength(3);
    }

    }

package ass3;

/**
 * Created by mihir on 09-05-2017.
 */
public class superVehicles {
    private String make;
    private String model;
    private int year;

    superVehicles(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    String getMake() {return make;}

    String getModel()
    {
        return model;
    }

    int getYear()
    {
        return year;
    }

    void print()
    {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " +
                year);
    }
}


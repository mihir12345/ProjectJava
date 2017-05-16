package ass3.ass8;

/**
 * Created by mihir on 09-05-2017.
 */
import java.util.ArrayList;
import java.util.List;

public class Array {

                                           //WRONG-------------------------------------------------------------------


        public static void main(String args[]) {

            double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 10.0};
                List number = new ArrayList();
            number.add(2.0);
            number.add(3.0);
            number.add(4.0);
            number.add(5.0);

            double sum = 0.0;
            double times = 1.0;
            double reciprocal=1/1.0;



            for (double num : array) {
                sum = sum + num;
                times = times * num;
                reciprocal=1/num;

            }
            System.out.println("Sum of array elements is:" + sum);
            System.out.println("");
            System.out.println("times of array element is:" + times);
            System.out.println("");
            System.out.println("reciprocal of array element is:"+reciprocal);
        }

    }

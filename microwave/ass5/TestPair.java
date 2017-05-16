/**
 * Created by mihir on 28-04-2017.
 */
public class TestPair {
    static Pair<Integer, Integer,Integer> goo(int x) {
        return new Pair<>(x + 3, x - 2, x+2);
    }

    public static void main(String... args) {
        Pair<Integer, Integer,Integer> p = new Pair<>(1, 2, 3);
        System.out.println(p);
        System.out.println(goo(5));

        new Pair<>(3, 4, 3);
        new Pair<>(2, 3.14, 4);
        new Pair<>(1, 2, 5);

        Pair<String, Integer,Integer> p1 = new Pair<>("abc", 1, 2);
        String  s1 = p1.first();
        Integer b1 = p1.second();
        Integer a1 = p1.third();
        System.out.println(s1 + " " + b1);

        Pair<String, Boolean,Integer> p2 = new Pair<>("abc", true, 2);

    }

}

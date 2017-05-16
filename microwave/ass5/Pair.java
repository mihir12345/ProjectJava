/**a
 * Created by mihir on 28-04-2017.
 */

    public class Pair<T, S, k> {

        private final T first;

        private final S second;

        private final k third;

        public Pair(T first, S second, k third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        public T first() {
            return first;
        }
        public S second(){
            return second;
        }
        public k third() {return  third; }
    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third+")";
    }
}



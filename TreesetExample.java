import java.util.TreeSet;
import java.util.Comparator;
class TreesetExample{
    public static void main(String[] args) {

        TreeSet<String> cities = new TreeSet<>(new cities_Comparator());
        cities.add("Pune");
        cities.add("Hyderabad");
        cities.add("Indore");
        cities.add("Bangaluru");
        System.out.println("TreeSet: " + cities);
    }

    public static class cities_Comparator implements Comparator<String> {

        @Override
        public int compare(String cities_one, String cities_two) {
            int value =  cities_one.compareTo(cities_two);
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }}}
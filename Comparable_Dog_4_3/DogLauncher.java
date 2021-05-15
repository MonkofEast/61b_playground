package Comparable_Dog_4_3;
import java.util.Comparator;

public class DogLauncher {
    public static void main(String[] args) {
        Dog_43 d1 = new Dog_43("apple", 10);
        Dog_43 d2 = new Dog_43("bed", 11);
        Dog_43 d3 = new Dog_43("car", 12);
        Dog_43[] dogs = new Dog_43[]{d1, d2, d3};
        // Comparable
        Dog_43 resDog = (Dog_43) Maximizer.max(dogs);
        resDog.bark();
        // Comparator
        Comparator<Dog_43> nc = Dog_43.getNameComparator();
        if (nc.compare(d1, d3) > 0) { // d1's name comes later than d3 in alphabet
            d1.bark();
        }
        else {
            d3.bark();
        }
    }
}

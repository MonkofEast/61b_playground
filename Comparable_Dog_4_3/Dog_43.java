package Comparable_Dog_4_3;

import java.util.Comparator;

public class Dog_43 implements Comparable<Dog_43> {
    private String name;
    private int size;

    public Dog_43 (String aname, int asize) {
        name = aname;
        size = asize;
    }

    public void bark() {
        System.out.println(name + " says: Bark!");
    }

    public int compareTo(Dog_43 adog) {
        return this.size - adog.size;
    }

    private static class NameComparator implements Comparator<Dog_43> {
        public int compare(Dog_43 dog1, Dog_43 dog2) {
            return dog1.name.compareTo(dog2.name);
        }
    }
    public static Comparator<Dog_43> getNameComparator() {
        return new NameComparator();
    }
}

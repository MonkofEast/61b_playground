// for exercise 1.2.1
// class or instance method

public class Dog {
    public int weightInPounds;

    public Dog(int w) {
        weightInPounds = w;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
      if (d1.weightInPounds > d2.weightInPounds) {
        return d1;
      }
      return d2;
    }

    public static void main(String[] args) {
      System.out.println("Exercise 1.2.1");
      Dog[] dogs = new Dog[2];
      dogs[0] = new Dog(8);
      dogs[1] = new Dog(20);
      // test
      Dog tmpdog = Dog.maxDog(dogs[0], dogs[1]);
      System.out.println(tmpdog.weightInPounds);

    }
}

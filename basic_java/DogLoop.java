// exercise 1.2.2
// what these codes do????

public class DogLoop {
    public static void main(String[] args) {
      System.out.println("Exercise 1.2.2");
   		Dog smallDog = new Dog(5);
   		Dog mediumDog = new Dog(25);
   		Dog hugeDog = new Dog(150);

   		Dog[] manyDogs = new Dog[4];
        manyDogs[0] = smallDog;
   		  manyDogs[1] = hugeDog;
        manyDogs[2] = new Dog(130);

   		int i = 0;
   		while (i < manyDogs.length) {
       		Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
       		i = i + 1;
      }
    }
}

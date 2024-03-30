package day16_classObejcts;

public class DogObjectsTest {

    public static void main(String[] args) {
        DogTest cat1 = new DogTest();

        cat1.name = "Tom";
        cat1.breed = "das";
        cat1.age = 18;
        cat1.color = "white";
        System.out.println(cat1.name);

        cat1.meow();
        cat1.oldAge(2);

    }
}

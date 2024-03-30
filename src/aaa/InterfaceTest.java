package aaa;

// Interface
interface AnimalTest {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class PigTest implements AnimalTest {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzzzzzzzz");
    }
}



public class InterfaceTest {

    public static void main(String[] args) {

        PigTest myPig = new PigTest();
        myPig.animalSound();
        myPig.sleep();

    }

}

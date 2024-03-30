package aaa;

class RemoteWebDriver{

}

class ChromeDriver extends RemoteWebDriver{

}

class FireFoxDriver extends RemoteWebDriver{

}

public class AAA {

    RemoteWebDriver driver1 = new ChromeDriver(); //upcasting
    //FireFoxDriver driver2 = driver1;



    // instance variable
    int a = 5;
    static int b;


    public void method2(){
        System.out.println(this.b);
        System.out.println(AAA.b);

    }
    public void method(){
        System.out.println(this.a);
        this.method2();
    }

    public static void main(String[] args) {

        // 2 objects r created, but only 1 string will be createed
        String a1 = "A";
        String a2 = "A";

        System.out.println(a1);


        // super keyword

        //local variable
        int b = 10;

        System.out.println(new AAA().a);


        // difference is memory location
        String str1 = "Cybertek"; // this one is String pool
        String str2 = new String("Cybertek"); // this one is created in heap


        try{
            throw new RuntimeException();
        }catch (RuntimeException e){

        }

        //nullPointer exception
        String name = "Student";
        name = null;
        System.out.println(name.charAt(0));








    }

}

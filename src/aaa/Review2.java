package aaa;

class A{
    static class B{

    }
}

class C{
    public C(int a){
        System.out.println("C");
    }
}

class D extends C{
    public D(){
        super(5);
        System.out.println("D");
    }
}


public class Review2 extends A.B {

    public static void method1(){

    }


    public static void main(String[] args) {
        new Review2().method1();



        String s1 = "";
        String s2 = null;
        System.out.println(s1.length());
        //System.out.println(s2.length());

         





    }

}

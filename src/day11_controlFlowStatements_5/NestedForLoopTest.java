package day11_controlFlowStatements_5;

public class NestedForLoopTest {

    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println("Outer Loop Iteration " +i);
            for(int j=1; j<=2; j++){
                System.out.println("i = " +i + "; j = " +j);
            }
        }
    }

}

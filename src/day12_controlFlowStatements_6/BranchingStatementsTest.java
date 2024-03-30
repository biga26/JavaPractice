package day12_controlFlowStatements_6;

public class BranchingStatementsTest {

    public static void main(String[] args) {

        int num = 0;

        while(num<15){

            num++;
            if(num<=5){
                System.out.println("Skipping number " + num);
                continue;
            }
            System.out.println("number = " + num);

            if(num>=10){
                System.out.println("Breaking at" + num);
                break;
            }

        }

    }

}

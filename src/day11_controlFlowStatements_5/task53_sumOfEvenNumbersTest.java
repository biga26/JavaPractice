package day11_controlFlowStatements_5;

public class task53_sumOfEvenNumbersTest {

    public static void main(String[] args) {

        int i=0;
        int sumEven=0;

        while(i<100){
            if(i%2==0){
                sumEven = sumEven + i;
            }
            i++;
        }
        System.out.println(sumEven);

    }

}

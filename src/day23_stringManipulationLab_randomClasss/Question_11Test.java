package day23_stringManipulationLab_randomClasss;

public class Question_11Test {

    public static void main(String[] args) {

        String str = "abc hi hohihi";

        int counter = 0;

        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("hi")){
                counter++;
            }

        }
        System.out.println(counter);

    }

}

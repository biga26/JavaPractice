package day27_arrays_part4;

public class TeamsTest {

    public static void main(String[] args) {

        String[][] teams1 = {
                {"Mike","Tonny","Smith","Evan"},
                {"David","Emmy","John","Ryan"}
        };

        System.out.println("First player of first team");
        System.out.println(teams1[0][0]);

        System.out.println("Number of rows: " + teams1.length);
        System.out.println("people in first team: " + teams1[0].length);
        System.out.println("people in second team: " + teams1[1].length);



    }

}

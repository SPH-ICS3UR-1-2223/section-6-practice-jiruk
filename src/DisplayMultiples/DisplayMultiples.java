package DisplayMultiples;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       //
       System.out.println("pick a number");
       int user = in.nextInt();
       
       for (int counter = 1; counter <=12; counter++)
    	   
    	   System.out.println(counter * user);
       
    }

}

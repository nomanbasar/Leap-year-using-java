
package leapyear;

import java.util.Scanner;


public class LeapYear {

    
    public static void main(String[] args) {
        Scanner yr = new Scanner(System.in);
        int year;
        System.out.print("Enter a year : ");
        year = yr.nextInt();
        
        if(year%400==0){
            System.out.println("Leap year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
    
}

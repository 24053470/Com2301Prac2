/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sammysrentalprice;
import java.util.Scanner;
/**
 *
 * @author 24053470
 */
public class SammysRentalPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minutes you've been using Sammy's equipment: ");
        double minUsed = scanner.nextInt();
        
        //CAALCULATING RENTAL COSTS
        
        double costHr = minUsed / 60;
        double chargePrice = costHr * 40;
        double chargeChange = minUsed % 60;
        double totalPrice = chargePrice + chargeChange; 
        
        System.out.println("Youv'e been using Sammy's equipment for " + minUsed);
        System.out.println("The total amount you have to pay is: " + totalPrice );
    }
}

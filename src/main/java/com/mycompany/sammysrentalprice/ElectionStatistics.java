/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.electionstatistics;
import java.util.Scanner;

/**
 *
 * @author 24053470
 */

public class ElectionStatistics {

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of the first party: ");
        String party1 = scanner.nextLine();
        System.out.print("Enter total votes received for the first party: ");
        double votes1 = scanner.nextInt();
        
        System.out.print("Enter the name of the second party: ");
        scanner.nextLine();
        String party2 = scanner.nextLine();
        System.out.print("Enter total votes received for the second party: ");
        double votes2 = scanner.nextInt();
        
        System.out.print("Enter the name of the third party: ");
        scanner.nextLine();
        String party3 = scanner.nextLine();
        System.out.print("Enter total votes received for the third party: ");
        double votes3 = scanner.nextInt();
        
        double totalVotes = votes1 + votes2 + votes3;
        
        //CALCULATING PERCEWNTAGGE
        double percent1 = (votes1 / totalVotes)*100;
        double percent2 = (votes2 / totalVotes)*100;
        double percent3 = (votes3 / totalVotes)*100;
        
        scanner.nextLine();

        //DISPLAYING PERCEWNTAGGE
        System.out.println(party1 + " got " + percent1 + " votes");
        System.out.println(party2 + " got " + percent2 + " votes");
        System.out.println(party3 + " got " + percent3 + " votes");
        
        
        
    }
}

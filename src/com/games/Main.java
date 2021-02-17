package com.games;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> positions = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

	while(true){
	    displayMenu();
	    int choice = sc.nextInt();

	    if(choice==1){
            System.out.print("Enter Number: ");
           positions.add(sc.nextInt());
            System.out.println("Added!!");
        }
	    else if(choice==2){
            System.out.print("Number To Delete: ");
            int del = sc.nextInt();
            if(positions.contains(del)){
                positions.remove(Integer.valueOf(del));
                System.out.println("Removed!!");
            }
            else{
                System.out.println("Number Not Found");
            }
        }
	    else if(choice==3){
            System.out.println(" list is: " + positions);
        }
	    else if(choice==4){
            System.out.println("Good Bye");
            break;
        }


    }
    }
    public  static void displayMenu(){
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Your Choice: ");

    }
}

package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Quiz score");
        int qS = input.nextInt();
        System.out.println("Enter your Mid-Term score");
        int mT = input.nextInt();
        System.out.println("Enter your Final score");
        int fS=input.nextInt();
        int avg=(qS+mT+fS)/3;


        if (avg >= 90) {
            System.out.println("You get an A");
        } else if (avg >= 70 && avg < 90) {;
        System.out.println("You get a B");
    }else if(avg>=50 && avg<70) {
            System.out.println("You get a C");
        }else{
            System.out.println("You get a F");
        }


    }
    }



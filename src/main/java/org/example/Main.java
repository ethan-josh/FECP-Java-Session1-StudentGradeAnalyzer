package org.example;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);

        ArrayList<Double> studentScores = new ArrayList<>();
        ArrayList<String> studentNames = new ArrayList<>();
        int[] countOfLetterGrades = {0, 0, 0, 0, 0};

        // Getting the number of students
        int studentCount = 0;
        System.out.print("Enter number of students: ");
        studentCount = myObj.nextInt();

        for (int i = 0; i < studentCount; i++){
            System.out.println();
            // Getting user input of students' name and grade
            System.out.printf("Enter name of student %d: ", i+1);
            String studentName = myObj.next();
            double studentGrade = 0.00;
            System.out.printf("Enter score for " + studentName + ": ");
            studentGrade = myObj.nextDouble();

            //  Add input to array list
            studentScores.add(studentGrade);
            studentNames.add(studentName);

            // Get letter grade
            if (studentGrade >= 90 && studentGrade <= 100){
                System.out.print(studentName + " got grade: A");
                countOfLetterGrades[0]++; // Adding count to A
            } else if (studentGrade >= 80 && studentGrade <= 89){
                System.out.print(studentName + " got grade: B");
                countOfLetterGrades[1]++; // Adding count to B
            } else if (studentGrade >= 70 && studentGrade <= 79){
                System.out.print(studentName + " got grade: C");
                countOfLetterGrades[2]++; // Adding count to C
            } else if (studentGrade >= 60 && studentGrade <= 69){
                System.out.print(studentName + " got grade: D");
                countOfLetterGrades[3]++; // Adding count to D
            } else if (studentGrade < 60){
                System.out.print(studentName + " got grade: F");
                countOfLetterGrades[4]++; // Adding count to E
            } else {
                System.out.print("Please enter a valid score.");
            }
            System.out.println();
        }
        // Getting the average score by adding all scores in the studentScores arraylist
        // and averaging them with the length of the arraylist
        double sumOfGrades = 0.00;
        for (double num : studentScores){
            sumOfGrades += num;
        }
        double averageScore = sumOfGrades / studentScores.size();

        // Display class summary
        System.out.println();
        System.out.println("----- Class Summary -----");
        System.out.printf("Average score: %.2f", averageScore);




    }
}

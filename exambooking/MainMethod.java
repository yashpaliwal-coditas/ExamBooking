package exambooking;

import java.util.Scanner;

public class MainMethod extends Thread{
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Attendance");
        int present = sc.nextInt();
        boolean flag = true,status=false;
        Attendance attendance = new Attendance(present);
        while (flag) {
            System.out.println("Enter you Choice\n1. Check Attendance Eligibility \n2. Attendance Regularization\n3. Display Exam Schedule\n0. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: status = attendance.checkEligibility();
                break;
                case 2: attendance.regularization();
                break;
                case 3: if(!status){
                    try{
                        throw new CheckException();
                    }catch (CheckException e){
                        System.out.println("You are not eligible for or check attendance status again");
                    }
                }
                else{
                    Exam exam = new Exam();
                    exam.display();
                }
                break;
                case 0: flag = false;
            }
        }
    }
    public static void main(String[] args) {
        MainMethod mainMethod = new MainMethod();
        mainMethod.start();
    }
}
//Please enter your Attendance
//63
//Enter you Choice
//1. Check Attendance Eligibility
//2. Attendance Regularization
//3. Display Exam Schedule
//0. Exit
//3
//We have not received your exam status or you attendance is not eligeble for Exam
//You are not eligible for or check attendance status again
//Enter you Choice
//1. Check Attendance Eligibility
//2. Attendance Regularization
//3. Display Exam Schedule
//0. Exit
//1
//Sorry you are not eligible for Exam
//Please regularize your attendance or you will not be allowed to give exam
//Enter you Choice
//1. Check Attendance Eligibility
//2. Attendance Regularization
//3. Display Exam Schedule
//0. Exit
//2
//Enter your choice
//1. Event
//2. Emergency
//3. home_visit
//0. Exit
//1
//Please enter quantity
//3
//Your Attendance is 69
//Enter your choice
//1. Event
//2. Emergency
//3. home_visit
//0. Exit
//2
//Please enter quantity
//2
//Your Attendance is 75
//Enter your choice
//1. Event
//2. Emergency
//3. home_visit
//0. Exit
//3
//Please enter quantity
//2
//Your Attendance is 77
//Enter your choice
//1. Event
//2. Emergency
//3. home_visit
//0. Exit
//0
//Enter you Choice
//1. Check Attendance Eligibility
//2. Attendance Regularization
//3. Display Exam Schedule
//0. Exit
//1
//
//Congratulations You are eligible for exam
//----ALL THE BEST FOR EXAMS----
//Enter you Choice
//1. Check Attendance Eligibility
//2. Attendance Regularization
//3. Display Exam Schedule
//0. Exit
//3
//1st March => DSA
//2nd March => JAVA
//3rd March => PYTHON
//4th March => Networking
//Enter you Choice
//1. Check Attendance Eligibility
//2. Attendance Regularization
//3. Display Exam Schedule
//0. Exit
//0
//
//Process finished with exit code 0
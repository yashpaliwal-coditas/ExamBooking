package exambooking;

import java.util.Scanner;

public class Attendance {
    int present;
    Attendance(int present){
        this.present = present;
    }
    boolean checkEligibility(){
        if(present<75){
            try {
                throw new AttendanceException();
            }
            catch (AttendanceException a){
                System.out.println("Please regularize your attendance or you will not be allowed to give exam");
            }
        }
        else{
            System.out.println("\nCongratulations You are eligible for exam\n----ALL THE BEST FOR EXAMS----");
            return true;
        }
        return false;
    }
    void regularization(){
        String reasons[] = {"Event","Emergency","home_visit"};
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice");
            for (int i=0;i<3;i++){
                System.out.println((i+1)+". "+reasons[i]);
            }
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            if(choice == 0){
                break;
            }
            System.out.println("Please enter quantity");
            int quantity = sc.nextInt();
            updateAttendance(choice, quantity);
        }
    }
    void updateAttendance(int choice,int quantity){
        switch (choice){
            case 1: present += 2*quantity;
            break;
            case 2: present += 3*quantity;
            break;
            case 3: present += 1*quantity;
            break;
            default:
                System.out.println("You had entered wrong choice");
        }
        System.out.println("Your Attendance is "+present);
    }
}

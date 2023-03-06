package exambooking;

public class AttendanceException extends Exception{
    AttendanceException(){
        System.out.println("Sorry you are not eligible for Exam");
    }
}

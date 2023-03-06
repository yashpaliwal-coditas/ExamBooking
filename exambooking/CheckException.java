package exambooking;

public class CheckException extends Exception{
    CheckException(){
        System.out.println("We have not received your exam status or you attendance is not eligeble for Exam");
    }
}

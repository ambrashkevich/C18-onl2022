package task2.services;

public class WrongLoginException extends Exception{
    public WrongLoginException(String message){
        super(message);
    }
}

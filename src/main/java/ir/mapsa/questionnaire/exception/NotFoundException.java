package ir.mapsa.questionnaire.exception;

public class NotFoundException extends RuntimeException{
    private String message;
    public NotFoundException(String message){
        this.message = message;
    }
}

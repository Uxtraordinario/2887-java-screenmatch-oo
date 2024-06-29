package br.com.alura.screenmatch.exception;

public class ConvertionErrorException extends RuntimeException {
    private String message;

    public ConvertionErrorException(String message) {
        this.message =  message;
    }

    @Override
    public String getMessage() {
    return this.message;
    }
}
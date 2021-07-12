package ee363.exceptions;

public class NonPositiveException extends RuntimeException { //Exception { 
public NonPositiveException(int i) {super("Number "+i+" is not positive.");}
}

package tascaS102.nivell03.exceptions;

import tascaS102.nivell03.Message;

public class NegativeValueException extends RuntimeException{
    public NegativeValueException(){
        super(Message.E_NEGATIVE_VALUE);
    }
}
package tascaS102.nivell03.exceptions;

import tascaS102.nivell03.Message;

public class StringWithNumbersException extends RuntimeException{
    public StringWithNumbersException(){
        super(Message.E_STRING_WITH_NUMBERS);
    }
}

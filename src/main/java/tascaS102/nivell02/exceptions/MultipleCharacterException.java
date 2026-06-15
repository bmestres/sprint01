package tascaS102.nivell02.exceptions;

import tascaS102.nivell02.Message;

public class MultipleCharacterException extends Exception {
    public MultipleCharacterException(){
        super(Message.EXCEPTION_ONE_CHAR);
    }
}

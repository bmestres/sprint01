package tascaS102.nivell03.exceptions;

import tascaS102.nivell03.Message;

public class OutOfRangeValueException extends RuntimeException {
    public OutOfRangeValueException(){
        super(Message.E_OUT_OF_RANGE_VALUE);
    }
}

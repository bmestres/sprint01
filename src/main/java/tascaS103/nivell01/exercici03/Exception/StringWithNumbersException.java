package tascaS103.nivell01.exercici03.Exception;

import tascaS103.nivell01.exercici03.Class.Message;

public class StringWithNumbersException extends RuntimeException {
    public StringWithNumbersException()
    { super(Message.E_EXCEPTION_STRING_WITH_NUM);
    }
}

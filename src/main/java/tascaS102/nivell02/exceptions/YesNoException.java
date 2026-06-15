package tascaS102.nivell02.exceptions;

import tascaS102.nivell02.Message;

public class YesNoException extends Exception{
    public YesNoException(){
        super(Message.EXCEPTION_YES_NO);
    }
}

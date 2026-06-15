package tascaS102.nivell02.exceptions;

import tascaS102.nivell02.Message;

public class ShortStringException extends Exception {
    public ShortStringException(){
        super(Message.EXCEPTION_SHORT_STRING);
    }
}

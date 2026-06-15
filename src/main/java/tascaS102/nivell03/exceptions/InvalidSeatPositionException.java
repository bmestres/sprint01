package tascaS102.nivell03.exceptions;

import tascaS102.nivell03.Message;

public class InvalidSeatPositionException extends RuntimeException{
    public InvalidSeatPositionException(){
        super(Message.E_INVALID_SIT_POSITION);
    }
}

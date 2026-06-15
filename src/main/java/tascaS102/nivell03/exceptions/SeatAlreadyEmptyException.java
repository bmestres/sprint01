package tascaS102.nivell03.exceptions;

import tascaS102.nivell03.Message;

public class SeatAlreadyEmptyException extends RuntimeException{
    public SeatAlreadyEmptyException(){
        super(Message.E_SEAT_ALREADY_EMPTY);
    }
}

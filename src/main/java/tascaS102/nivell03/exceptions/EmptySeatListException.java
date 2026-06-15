package tascaS102.nivell03.exceptions;

import tascaS102.nivell03.Message;

public class EmptySeatListException extends RuntimeException {
    public EmptySeatListException()
    {
        super(Message.E_EMPTY_SEAT_LIST);
    }
}

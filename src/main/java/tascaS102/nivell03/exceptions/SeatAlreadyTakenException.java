package tascaS102.nivell03.exceptions;

import tascaS102.nivell03.Message;

public class SeatAlreadyTakenException extends RuntimeException {
    public SeatAlreadyTakenException() {
        super(Message.E_SEAT_ALREADY_TAKEN);
    }
}

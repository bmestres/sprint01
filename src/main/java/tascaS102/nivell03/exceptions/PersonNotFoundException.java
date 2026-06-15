package tascaS102.nivell03.exceptions;

import tascaS102.nivell03.Message;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(){
        super(Message.E_PERSON_NOT_FOUND);
    }

}

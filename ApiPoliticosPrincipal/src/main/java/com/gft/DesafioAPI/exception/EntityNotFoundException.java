package com.gft.DesafioAPI.exception;

public class EntityNotFoundException extends APIException {


    private static final long serialVersionUID = 1L;

    public EntityNotFoundException(String message) {
        super(message);
    }
}


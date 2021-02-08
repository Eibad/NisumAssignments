package com.example.schoolmanagement.exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class DaoException extends RuntimeException {

    public DaoException(String msg){
        super(msg);
    }
}

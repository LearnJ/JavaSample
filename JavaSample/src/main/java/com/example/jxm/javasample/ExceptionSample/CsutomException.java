package com.example.jxm.javasample.ExceptionSample;

/**
 * Created by jiamao on 2018/5/25.
 */

public class CsutomException extends Exception {
    public CsutomException() {
        super();
    }

    public CsutomException(String s) {
        super(s);
    }

    public CsutomException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public CsutomException(Throwable throwable) {
        super(throwable);
    }

    protected CsutomException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

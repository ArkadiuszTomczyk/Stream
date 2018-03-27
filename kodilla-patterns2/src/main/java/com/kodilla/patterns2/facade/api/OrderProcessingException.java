package com.kodilla.patterns2.facade.api;

public class OrderProcessingException extends Exception {
    public static String ERR_NOT_AUTHORISED = "user is not authorised";
    public static String ERR_PAYMENT_REJECTED = "paymant was rejected";
    public static String ERR_VERIFICATION_ERROR = "verification error";
    public static String ERR_SUBMITTING_ERROR = "cannot submit oder";

    public OrderProcessingException(String message) {
        super(message);
    }
}

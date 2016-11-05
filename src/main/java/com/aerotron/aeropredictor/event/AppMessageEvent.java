package com.aerotron.aeropredictor.event;

public class AppMessageEvent {

    private String mMessage;

    public AppMessageEvent(String message) {
        mMessage = message;
    }

    public String getMessage() {
        return mMessage;
    }


}

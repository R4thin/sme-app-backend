package com.me.sparta.repositories.model;

public class Response {

    private String message;
    private Object object;

    public Response() {
    }

    public Response(String message, Object object) {
        this.message = message;
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", object=" + object +
                '}';
    }
}

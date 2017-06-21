package com.appbusters.robinkamboj.firebasehack;

/**
 * Created by VASU on 5/10/2017.
 */

public class ChatMessage {

    private String message = "";
    private String date = "";
    private String name = "";
    private int type;

    public ChatMessage(){

    }

    public ChatMessage(String message , String date , String user){
        this.message = message ;
        this.date = date ;
        this.name = user ;

    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



}

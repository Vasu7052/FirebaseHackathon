package com.appbusters.robinkamboj.firebasehack;

/**
 * Created by VASU on 5/10/2017.
 */

public class UserChats {



    String message = "" ;
    String name = "" ;
    String date = "" ;

    public UserChats(){

    }

    public UserChats(String message , String user , String date){
        this.message = message ;
        this.name = user ;
        this.date = date ;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

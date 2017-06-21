package com.appbusters.robinkamboj.firebasehack;

/**
 * Created by VASU on 6/21/2017.
 */

public class UserDetails {

    String name = "" ;
    String user_type = "" ;
    String user_id = "" ;

    UserDetails(){

    }

    UserDetails(String name , String user_type , String user_id){
        this.name = name ;
        this.user_type = user_type ;
        this.user_id = user_id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

}

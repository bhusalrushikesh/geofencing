package com.example.myrestuarant.Common;

import com.example.myrestuarant.Model.User;

public class Common {

    public static User currentUser;

    public static final String DELETE = "Delete";
    public static final String USER_KEY = "User";
    public static final String PWD_KEY = "Password";

    public static String convertCodeToStatus(String status) {

        if(status.equals("0"))
            return "Placed";
        else if(status.equals("1"))
            return "On My Way";
        else
            return "Served";


    }

}

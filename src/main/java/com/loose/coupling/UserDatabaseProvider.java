package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        //Assume Directly access Database here
        return "User Details From Database";
    }
}

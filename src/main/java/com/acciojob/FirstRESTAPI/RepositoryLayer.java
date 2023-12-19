package com.acciojob.FirstRESTAPI;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RepositoryLayer {

    Map<Integer,User> userDb = new HashMap<>();


    public String addUserToDb(User user){

        int dbKey = user.getUserId();
        userDb.put(dbKey,user);
        return "User has been added to DB";

    }

    public User getfromDb(int userId){
        return userDb.get(userId);
    }


    public List<User> getAllUsers(){

        //We need a list of User Objects that are present in the HashMap

        List<User> userList = new ArrayList<>();

        for(User user:userDb.values()){
            userList.add(user);
        }
        return userList;
    }




}

package com.acciojob.FirstRESTAPI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {

    @Autowired
    private RepositoryLayer repoObject;


    public String addUserToDb(User user){

        String result = repoObject.addUserToDb(user);
        return result;
        //I need to call a method from the Repository Layer

    }


    public User getFromDb(int userId){

        User userObj= repoObject.getfromDb(userId);
        return userObj;
    }


    public String personWithYoungestAge(){

        //From repository fetched all the Users
        List<User> allUser = repoObject.getAllUsers();
        int minAge = 100;
        String ansName = null;

        for(User user:allUser){

            if(user.getAge()<minAge){

                minAge = user.getAge();
                ansName = user.getName();
            }
        }
        return ansName;
    }


    public int getTotalPeople(){

        //Get raw data from DB
        List<User> allUsers = repoObject.getAllUsers();

        int totalPeople = allUsers.size();
        return totalPeople;
    }

}

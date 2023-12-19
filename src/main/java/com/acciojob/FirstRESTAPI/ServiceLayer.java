package com.acciojob.FirstRESTAPI;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {

    RepositoryLayer repoObj = new RepositoryLayer();


    public String addUserToDb(User user){

        String result = repoObj.addUserToDb(user);
        return result;
        //I need to call a method from the Repository Layer

    }


    public User getFromDb(int userId){

        User userObj= repoObj.getfromDb(userId);
        return userObj;
    }


    public String personWithYoungestAge(){

        //From repository fetched all the Users
        List<User> allUser = repoObj.getAllUsers();
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

}

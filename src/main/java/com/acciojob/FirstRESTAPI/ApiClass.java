package com.acciojob.FirstRESTAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController //This tells spring application that this Class is having APIs written
public class ApiClass {


    //Create a hashMap that will act Like a Database.

    Map<Integer,User> userDb = new HashMap<>();

    @GetMapping("/getWeatherUpdate")
    public String getWeatherUpdate(){

        return "The weather is good, The winds are at 10KmpH and " +
                "temperature now is 20C and humidity is 20%";

    }


    @PostMapping("/addUserViaBody")
    public String addUserViaReqBody(@RequestBody User userObj){

        int dbKey = userObj.getUserId();
        userDb.put(dbKey,userObj);
        return "User has been added to the DB";
    }








    @GetMapping("/addUser")
    public String addUser(@RequestParam("userId")int userId,
                          @RequestParam("age")int age,
                          @RequestParam("name")String name){

        //To add this info to the DB.
        User userObj = new User(name,age,userId);

        int dbKey = userId;

        userDb.put(dbKey,userObj);

        return "User has been added to the DB";
    }


    @GetMapping("/getUserInfo")
    public User getUser(@RequestParam("userId")int userId){

        User user = userDb.get(userId);
        return user;
    }

    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable("userId")Integer userId){

        User user = userDb.get(userId);
        return user;
    }











}

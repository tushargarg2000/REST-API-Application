package com.acciojob.FirstRESTAPI;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Slf4j
@RestController
public class ControllerLayer {


    List<Integer> li = new ArrayList<>();

    @Autowired
    private ServiceLayer serviceLayerObj;

    @GetMapping("/printLogs")
    public void printLogs(){

        log.trace("This is a trace level log");
        log.debug("This is a debug log");
        log.info("This is an info level log");
        log.warn("This is a warning log");
        log.error("This is a error log");
    }


    @PostMapping("/addToDb")
    public ResponseEntity<String> addToDb(@RequestBody User user){

        String result = serviceLayerObj.addUserToDb(user);

        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }

    @GetMapping("/getFromDb")
    public ResponseEntity<User> getFromDb(@RequestParam("userId")Integer userId){

        User userObj = serviceLayerObj.getFromDb(userId);

        return new ResponseEntity<>(userObj,HttpStatus.OK);

    }


    @GetMapping("/getNameWithYoungestAge")
    public ResponseEntity<String> getNameOfPerson(){

        String name = serviceLayerObj.personWithYoungestAge();
        return new ResponseEntity<>(name,HttpStatus.BAD_GATEWAY);
    }

    @GetMapping("/getTotalPeopleRegistered")
    public ResponseEntity<Integer> getTotalPeople(){
        int ans = serviceLayerObj.getTotalPeople();
        return new ResponseEntity<>(ans,HttpStatus.ACCEPTED);
    }

}

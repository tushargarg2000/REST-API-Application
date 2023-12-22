package com.acciojob.FirstRESTAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceLayer {


    @Autowired
    private RepositoryLayer repoObj;

}

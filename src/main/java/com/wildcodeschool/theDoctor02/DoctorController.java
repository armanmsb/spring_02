package com.wildcodeschool.theDoctor02;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class DoctorController {

    @RequestMapping("/doctor/{incarnationNumber}")
    public DoctorResponse getDoctor(@PathVariable int incarnationNumber) {

        switch(incarnationNumber){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                throw new ResponseStatusException(HttpStatus.SEE_OTHER, "See other");
            case 9:
                return new DoctorResponse("Christopher Eccleston", 9);
            case 10:
                return new DoctorResponse("David Tennant", 10);
            case 11:
                return new DoctorResponse("Matt Smitsh", 11);
            case 12:
                return new DoctorResponse("Peter Capaldi", 12);
            case 13:
                return new DoctorResponse("Jodie Whittaker", 13);
            default:
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible to retrive the incarnation " + incarnationNumber);
        }

    }


}

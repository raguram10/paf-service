package org.example.Controller;

import org.example.Model.BaseResponse;
import org.example.Model.LoginRequest;
import org.example.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller{
    @Autowired
    Service service;

    @GetMapping(value = "/Status/{id}")
    public Boolean getStatus(@PathVariable("id") int id)
    {
       return service.getId(id);
    }
    @GetMapping(value="/Name/{String}")
    public String getName(@PathVariable("String") String name)
    {
        return service.getName(name);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/login")
    public ResponseEntity<BaseResponse> login(@RequestBody LoginRequest loginRequest)
    {
        System.out.println(loginRequest.toString());
        if(loginRequest.getUsername().contentEquals("ragu"))
        {
            return ResponseEntity.ok(new BaseResponse("OK"));
        }
        else
        {
            return ResponseEntity.ok(new BaseResponse("NOT OK"));

        }
        
    }

}

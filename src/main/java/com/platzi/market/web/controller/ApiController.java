package com.platzi.market.web.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class ApiController {

    
    @GetMapping("/status")
    @ApiOperation("Search a product with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Error"),
    })
    public ResponseEntity testCafeto(@RequestParam Boolean status) {
        if(status){
          return new ResponseEntity(true, HttpStatus.OK);
        }else{
          return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/")
    @ResponseBody
    public String getFoosBySimplePath() {
        return "Hello world";
    }

}

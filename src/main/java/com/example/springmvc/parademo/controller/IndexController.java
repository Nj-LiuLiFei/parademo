package com.example.springmvc.parademo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class IndexController {

    @GetMapping(value = "getTest/PathVariable/{id}")
    public ResponseEntity getPathVariable(@PathVariable(name = "id") Integer id){
        return new ResponseEntity(id,HttpStatus.OK);
    }

    @GetMapping(value = "getTest/RequestParam")
    public ResponseEntity getRequestParam(@RequestParam(name = "id") Integer id,
                                          @RequestParam(name = "array[]") String[] str){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",id);
        map.put("array",str);
        return new ResponseEntity(map,HttpStatus.OK);
    }
}

package com.example.springmvc.parademo.controller;

import com.example.springmvc.parademo.model.Demo3;
import com.example.springmvc.parademo.model.Demo4;
import com.example.springmvc.parademo.model.Demo5;
import com.example.springmvc.parademo.model.Demo7;
import org.apache.logging.log4j.spi.LoggerRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

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
        Map map = new HashMap<String,Object>();
        map.put("id",id);
        map.put("array",str);
        return new ResponseEntity(map,HttpStatus.OK);
    }

    @GetMapping(value = "getTest/RequestParam3")
    public ResponseEntity getRequestParam3(Demo3 demo3){
        Map map = new HashMap<String,Object>();
        map.put("result",demo3);
        return new ResponseEntity(map,HttpStatus.OK);
    }
    /*
    * Get、Post结果相同
    * */
    @RequestMapping(value = "getTest/RequestParam4")
    public ResponseEntity getRequestParam4(Demo4 demo4){
        Map map = new HashMap<String,Object>();
        map.put("result",demo4);
        return new ResponseEntity(map,HttpStatus.OK);
    }

    /*
    * @RequestBody
    * 当请求的contentType 是application/json;charset=UTF-8 时 使用@RequestBody注释
    * application/x-www-form-urlencoded 的类型会类型错误。
    * */

    @PostMapping(value = "getTest/RequestParam5")
    public ResponseEntity getRequestParam5(
            @RequestBody Demo5 demo5){
        Map map = new HashMap<String,Object>();
        map.put("result",demo5);
        return new ResponseEntity(map,HttpStatus.OK);
    }

    @PostMapping(value = "getTest/RequestParam6")
    public ResponseEntity getRequestParam6(
            @RequestBody Map<String,Object> jsonMap){
        Map map = new HashMap<String,Object>();
        map.put("result",jsonMap);
        return new ResponseEntity(map,HttpStatus.OK);
    }

    @PostMapping(value = "getTest/RequestParam7")
    public ResponseEntity getRequestParam7(
            @RequestBody Demo6 demo6){
        Map map = new HashMap<String,Object>();
        map.put("result",demo6);
        return new ResponseEntity(map,HttpStatus.OK);
    }

    @PostMapping(value = "getTest/RequestParam8")
    public ResponseEntity getRequestParam8(
            @RequestBody Demo7 demo7){
        Map map = new HashMap<String,Object>();
        map.put("result",demo7);
        return new ResponseEntity(map,HttpStatus.OK);
    }

    @PostMapping(value = "getTest/RequestParam9")
    public ResponseEntity getRequestParam9(
            Demo6 demo6){
        Map map = new HashMap<String,Object>();
        map.put("result",demo6);
        return new ResponseEntity(map,HttpStatus.OK);
    }

    @PostMapping(value = "getTest/RequestParam10")
    public ResponseEntity getRequestParam10(
            Demo6 demo6){
        Map map = new HashMap<String,Object>();
        map.put("result",demo6);
        return new ResponseEntity(map,HttpStatus.OK);
    }

    @PostMapping(value = "getTest/RequestParam11")
    public ResponseEntity getRequestParam11(
            String name,
            Demo6 demo6){
        Map map = new HashMap<String,Object>();
        map.put("name",name);
        map.put("result",demo6);
        return new ResponseEntity(map,HttpStatus.OK);
    }

    private static class  Demo6{
        private Integer id;
        private String text;
        private String[] strings;
        private Map<String,Object> map;
        private List<String> list;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String[] getStrings() {
            return strings;
        }

        public void setStrings(String[] strings) {
            this.strings = strings;
        }

        public Map<String, Object> getMap() {
            return map;
        }

        public void setMap(Map<String, Object> map) {
            this.map = map;
        }

        public List<String> getList() {
            return list;
        }

        public void setList(List<String> list) {
            this.list = list;
        }
    }


}

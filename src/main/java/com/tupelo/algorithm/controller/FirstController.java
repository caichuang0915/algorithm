package com.tupelo.algorithm.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caichuang
 * @version V1.0
 * @date 2019/6/4 18:16
 * @Description
 */
@RestController
public class FirstController {

    @RequestMapping(value = "/first/{str}",method = RequestMethod.GET)
    public String getFirstRequest(@PathVariable String str){
        return str;
    }
}

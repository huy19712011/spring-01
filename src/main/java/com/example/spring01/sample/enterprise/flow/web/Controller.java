/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring01.sample.enterprise.flow.web;

import com.example.spring01.sample.enterprise.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author huynq
 */
// sending response in the right format
@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;

    //
    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calculateSum();
    }

}


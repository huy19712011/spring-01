/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring01.sample.enterprise.flow.data;

import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
@Component
public class DataService {

    public List<Integer> retrieveData() {
        return List.of(1, 2, 3, 4, 5, 6);
    }

}

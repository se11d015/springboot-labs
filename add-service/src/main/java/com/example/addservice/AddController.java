package com.example.addservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    @Autowired
    RemoteMagicValueService remoteMagicValueService;

    @GetMapping("add/{num}")
    public String add(@PathVariable Integer num){
        int remoteVal = Integer.parseInt(remoteMagicValueService.get_magic_value());
        num = num + remoteVal;
        return num.toString();
    }
}

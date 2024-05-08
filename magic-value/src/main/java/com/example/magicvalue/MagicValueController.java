package com.example.magicvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagicValueController {
    @Value("${magic}")
    private  Integer magic_value;
    @GetMapping("/value")
    public String getMagicValue(){
        return this.magic_value.toString();
    }
}

package com.example.addservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MAGIC-VALUE")
public interface RemoteMagicValueService {
    @GetMapping(value = "/value", produces = MediaType.APPLICATION_JSON_VALUE)
    public String get_magic_value();
}

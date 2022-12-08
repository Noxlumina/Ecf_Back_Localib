package com.example.ecf_back_localib.utils;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("debug")
@Data
@Profile("dev")
public class DebugController {



    @DeleteMapping("clear")
    public void clear(){

    }

    @PostMapping("init")
    public void init(){
        clear();
    }
}

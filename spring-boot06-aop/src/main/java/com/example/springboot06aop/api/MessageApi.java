package com.example.springboot06aop.api;

import com.example.springboot06aop.service.IkinciMesajService;
import com.example.springboot06aop.service.MessaageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageApi {

    @Autowired
    private MessaageService messaageService;

    @Autowired
    private IkinciMesajService ikinciMesajService;

    @PostMapping()
    public ResponseEntity<String> mesajVer(@RequestBody String message){
        ikinciMesajService.mesaj(message);
        return ResponseEntity.ok(messaageService.mesajVer(message));
    }

}

package com.cfa.controller;

import com.cfa.model.QuadroA3Info;
import com.cfa.service.QuadroA3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quadro-a3-info")
public class QuadroA3Controller {

    private final QuadroA3Service quadroA3Service;

    @Autowired
    public QuadroA3Controller(QuadroA3Service quadroA3Service) {
        this.quadroA3Service = quadroA3Service;
    }

    @GetMapping
    public ResponseEntity<QuadroA3Info> getQuadroA3Info() {
        QuadroA3Info quadroA3Info = quadroA3Service.getQuadroA3Info();
        return ResponseEntity.ok(quadroA3Info);
    }

    @PostMapping
    public ResponseEntity<QuadroA3Info> saveQuadroA3Info(@RequestBody QuadroA3Info quadroA3Info) {
        QuadroA3Info savedQuadroA3Info = quadroA3Service.saveQuadroA3Info(quadroA3Info);
        return new ResponseEntity<QuadroA3Info>(savedQuadroA3Info, HttpStatus.CREATED);
    }
}

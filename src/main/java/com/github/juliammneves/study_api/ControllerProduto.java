package com.github.juliammneves.study_api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ControllerProduto {

    public ResponseEntity<String> demo(){
        return ResponseEntity.status(203).body("Mensagem teste");
    }

    @PostMapping
    public ResponseEntity<String> create(){
        return ResponseEntity.status(201).body("Produto cadastrado: maçã");
    }

    @PutMapping
    public ResponseEntity<String> update(){
        return ResponseEntity.status(201).body("Produto atualizado: maçã");
    }

    @GetMapping
    public ResponseEntity<String> find(){
        return ResponseEntity.status(201).body("maçã");
    }

    @DeleteMapping
    public ResponseEntity<String> delete(){
        return ResponseEntity.status(201).body("Produto deletado: maçã");
    }
}

package br.com.fiap3espf.spring_boot_project.controller;

import br.com.fiap3espf.spring_boot_project.instrutor.DadosCadastroInstrutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")

public class InstrutorController {
    @PostMapping
    public void cadastrarInstrutor(@RequestBody DadosCadastroInstrutor dados){
        System.out.println(dados);
    }
}

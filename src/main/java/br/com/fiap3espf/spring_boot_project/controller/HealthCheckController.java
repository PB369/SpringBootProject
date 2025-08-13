package br.com.fiap3espf.spring_boot_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health_check")

public class HealthCheckController {
    @GetMapping
    public String healthCheck() {
        return "Verificação de Integridade do Spring Boot turma 3ESPF.";
    }
}

package br.com.fiap3espf.spring_boot_project.instrutor;

import br.com.fiap3espf.spring_boot_project.endereco.Endereco;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name = "instrutores")
@Entity(name = "Instrutor")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Instrutor {
    @Id
    Long id;
    String nome;
    String email;
    String cnh;
    Especialidade especialidade;
    Endereco endereco;
}

package com.example.educacional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EducacionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducacionalApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(RecursoRepository repository) {
        return args -> {
            insertJavaAdvocates(repository);
            System.out.println(repository);
            System.out.println(repository.findAll());
        };
    }

    private void insertJavaAdvocates(RecursoRepository repository) {
        repository.save(new Recurso("Teste", "Descricao do recurso", "02122021", "data"));
        repository.save(new Recurso("Teste2", "Aqui adiciona descricao", "dta", "data3"));
    }

}


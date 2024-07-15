package com.farmacia.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication ;

/**
 * <h1>Farmacia</h1>
 * Classe principal da aplicação Farmacia.
 * 
 * Esta é a classe de entrada para a aplicação Spring Boot.
 * 
 * @version 1.0
 * @since 2024-07-14
 * 
 * Autor: Seu Nome
 */
@SpringBootApplication
public class FarmaciaApplication {

    /**
     * Método principal que inicia a aplicação.
     * 
     * @param args argumentos da linha de comando.
     */
    public static void main(String[] args) {
        SpringApplication.run(FarmaciaApplication.class, args);
    }
}
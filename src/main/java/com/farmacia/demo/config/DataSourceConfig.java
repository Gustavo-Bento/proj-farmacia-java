package com.farmacia.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Configuração da fonte de dados para a aplicação.
 * 
 * Esta classe configura a conexão com o banco de dados MySQL.
 * 
 * @version 1.0
 * @since 2024-07-14
 * 
 * @author Gustavo Ferreira
 */
@Configuration
public class DataSourceConfig {
    
    /**
     * Cria e configura a fonte de dados.
     * 
     * @return a fonte de dados configurada.
     */
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/farmacia_db");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
}

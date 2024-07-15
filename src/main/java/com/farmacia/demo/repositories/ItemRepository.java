package com.farmacia.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.demo.entities.Item;

/**
 * Repositório para a entidade {@link Item}.
 * 
 * Esta interface fornece métodos para realizar operações CRUD (Create, Read, Update, Delete) na entidade {@link Item}.
 * 
 * @version 1.0
 * @since 2024-07-14
 * 
 * @author Gustavo Ferreira
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    
}

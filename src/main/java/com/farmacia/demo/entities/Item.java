package com.farmacia.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Representa um item na farmácia.
 * Cada item possui um identificador único, nome, descrição, quantidade e preço.
 * 
 * @version 1.0
 * @since 2024-07-14
 * 
 * @author Gustavo Ferreira
 */
@Entity
public class Item {

    /**
     * Identificador único do item.
     * Gerado automaticamente pela estratégia de identidade.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome do item.
     */
    private String name;

    /**
     * Descrição do item.
     */
    private String description;

    /**
     * Quantidade do item disponível no estoque.
     */
    private int quantity;

    /**
     * Preço do item.
     */
    private double price;

    /**
     * Obtém o identificador do item.
     * 
     * @return o identificador do item.
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o identificador do item.
     * 
     * @param id o novo identificador do item.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtém o nome do item.
     * 
     * @return o nome do item.
     */
    public String getName() {
        return name;
    }

    /**
     * Define o nome do item.
     * 
     * @param name o novo nome do item.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtém a descrição do item.
     * 
     * @return a descrição do item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define a descrição do item.
     * 
     * @param description a nova descrição do item.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtém a quantidade do item disponível no estoque.
     * 
     * @return a quantidade do item.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Define a quantidade do item disponível no estoque.
     * 
     * @param quantity a nova quantidade do item.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Obtém o preço do item.
     * 
     * @return o preço do item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Define o preço do item.
     * 
     * @param price o novo preço do item.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}

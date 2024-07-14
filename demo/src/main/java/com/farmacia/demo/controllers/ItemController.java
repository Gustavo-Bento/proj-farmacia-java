package com.farmacia.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.demo.entities.Item;
import com.farmacia.demo.services.ItemService;

/**
 * Controlador REST para gerenciar operações relacionadas a {@link Item}.
 * 
 * Este controlador fornece endpoints para recuperar, atualizar e deletar itens.
 * 
 * @version 1.0
 * @since 2024-07-14
 * 
 * Autor: Seu Nome
 */
@RestController
@RequestMapping("/api/items")
public class ItemController {
    
    @Autowired
    private ItemService itemService;

    /**
     * Recupera todos os itens.
     * 
     * @return uma lista de todos os itens.
     */
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    /**
     * Recupera um item pelo seu identificador.
     * 
     * @param id o identificador do item.
     * @return um {@link Optional} contendo o item se encontrado, ou vazio se não encontrado.
     */
    @GetMapping("/{id}")
    public Optional<Item> getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    /**
     * Atualiza um item existente.
     * 
     * @param id o identificador do item a ser atualizado.
     * @param itemDetails os detalhes do item para atualização.
     * @return o item atualizado.
     */
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item itemDetails) {
        return itemService.updateItem(id, itemDetails);
    }

    /**
     * Deleta um item pelo seu identificador.
     * 
     * @param id o identificador do item a ser deletado.
     */
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }
}

package com.farmacia.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmacia.demo.entities.Item;
import com.farmacia.demo.repositories.ItemRepository;

/**
 * Serviço para gerenciar operações relacionadas a {@link Item}.
 * 
 * Este serviço fornece métodos para recuperar, criar, atualizar e deletar itens.
 * 
 * @version 1.0
 * @since 2024-07-14
 * 
 * @author Gustavo Ferreira
 */
@Service
public class ItemService {
    
    @Autowired
    private ItemRepository itemRepository;

    /**
     * Recupera todos os itens.
     * 
     * @return uma lista de todos os itens.
     */
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    /**
     * Recupera um item pelo seu identificador.
     * 
     * @param id o identificador do item.
     * @return um {@link Optional} contendo o item se encontrado, ou vazio se não encontrado.
     */
    public Optional<Item> getItemById(long id) {
        return itemRepository.findById(id);
    }

    /**
     * Cria um novo item.
     * 
     * @param item o item a ser criado.
     * @return o item criado.
     */
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    /**
     * Atualiza um item existente.
     * 
     * @param id o identificador do item a ser atualizado.
     * @param itemDetails os detalhes do item para atualização.
     * @return o item atualizado.
     * @throws RuntimeException se o item não for encontrado.
     */
    public Item updateItem(Long id, Item itemDetails) {
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item não encontrado")); 
        item.setName(itemDetails.getName());
        item.setDescription(itemDetails.getDescription());
        item.setPrice(itemDetails.getPrice());
        item.setQuantity(itemDetails.getQuantity());
        return itemRepository.save(item);
    }

    /**
     * Deleta um item pelo seu identificador.
     * 
     * @param id o identificador do item a ser deletado.
     * @throws RuntimeException se o item não for encontrado.
     */
    public void deleteItem(Long id) {
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item não encontrado"));
        itemRepository.delete(item);
    }
}

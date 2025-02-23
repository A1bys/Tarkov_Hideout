package org.TarkovHideout.Service;

import org.TarkovHideout.Model.Item;
import org.TarkovHideout.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ItemService
{
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems()
    {
        return itemRepository.findAll();
    }

    public Item getItembyId(UUID id)
    {
        return itemRepository.findById(id).orElse(null);
    }

    public Item saveItem(Item item)
    {
        return itemRepository.save(item);
    }

    public void deleteItem(UUID id)
    {
        itemRepository.deleteById(id);
    }
}

package org.TarkovHideout.Controller;

import org.TarkovHideout.Model.Item;
import org.TarkovHideout.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/item")
public class ItemController
{
    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItems()
    {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItembyId(@PathVariable UUID id)
    {
        return itemService.getItembyId(id);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item)
    {
        return itemService.saveItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable UUID id)
    {
        itemService.deleteItem(id);
    }
}

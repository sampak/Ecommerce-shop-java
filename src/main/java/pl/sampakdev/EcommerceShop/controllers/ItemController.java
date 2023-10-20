package pl.sampakdev.EcommerceShop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sampakdev.EcommerceShop.models.Item;
import pl.sampakdev.EcommerceShop.repository.ItemRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/items")
public class ItemController {


    @Autowired
    ItemRepository itemRepository;



    @GetMapping("")
    public List<Item> items() {
        return this.itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Item> item(@PathVariable("id") String id) {
        return this.itemRepository.findById(id);
    }

    @PostMapping("")
    public Item createItem(@RequestBody Item item) {
        Item entity = new Item(item.getName(), item.getPrice());
        return this.itemRepository.save(entity);
    }

}

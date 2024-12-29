package com.kodilla.strefakursow.service.impl;

import com.kodilla.strefakursow.entity.Item;
import com.kodilla.strefakursow.repository.ItemRepository;
import com.kodilla.strefakursow.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public List<Item> getItemsWithQuantityOverTwenty() {
        return itemRepository.getItemsWithQuantityOverTwenty();
    }

    @Override
    public List<Item> getItemsWithQuantityOver(int minQuantityTreshold) {
        return itemRepository.getItemsWithQuantityOver(minQuantityTreshold);
    }

    @Override
    public List<Item> getItemsWithNameLike(String regex) {
        return itemRepository.getItemsWithNameLike(regex);
    }

    @Override
    public List<Item> findByQuantityGreaterThanEqualOrderByQuantityDesc(Integer minQuantity) {
        return itemRepository.findByQuantityGreaterThanEqualOrderByQuantityDesc(minQuantity);
    }
}

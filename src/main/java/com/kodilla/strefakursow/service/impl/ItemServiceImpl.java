package com.kodilla.strefakursow.service.impl;

import com.kodilla.strefakursow.entity.Item;
import com.kodilla.strefakursow.repository.ItemRepository;
import com.kodilla.strefakursow.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public void saveItem(Item item) {
        itemRepository.save(item);
    }
}

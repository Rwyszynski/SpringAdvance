package com.kodilla.strefakursow.repository;

import com.kodilla.strefakursow.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}

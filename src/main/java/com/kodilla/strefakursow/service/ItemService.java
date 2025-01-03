package com.kodilla.strefakursow.service;

import com.kodilla.strefakursow.entity.Item;

import java.util.List;

public interface ItemService {

    public void saveItem(Item item);

    public List<Item> getItemsWithQuantityOverTwenty();

    public List<Item> getItemsWithQuantityOver(int minQuantityTreshold);

    public List<Item> getItemsWithNameLike(String nameLike);

    public List<Item> findByQuantityGreaterThanEqualOrderByQuantityDesc(Integer minQuantity);
}

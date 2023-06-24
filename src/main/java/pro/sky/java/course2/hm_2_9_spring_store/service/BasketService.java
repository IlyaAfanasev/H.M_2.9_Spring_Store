package pro.sky.java.course2.hm_2_9_spring_store.service;

import pro.sky.java.course2.hm_2_9_spring_store.model.Product;

import java.util.Collection;
import java.util.List;

public interface BasketService {
    String addProductToBasket(List<Integer> idProducts);

    Collection<Product> getShoppingList();


}

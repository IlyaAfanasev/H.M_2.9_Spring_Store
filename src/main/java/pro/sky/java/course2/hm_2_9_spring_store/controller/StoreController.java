package pro.sky.java.course2.hm_2_9_spring_store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.hm_2_9_spring_store.model.Product;
import pro.sky.java.course2.hm_2_9_spring_store.service.BasketService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final BasketService basketService;

    public StoreController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public String addOrderedProduct(@RequestParam("id") List<Integer> idProducts) {
        return basketService.addProductToBasket(idProducts);
    }

    @GetMapping(path = "/get")
    public Collection<Product> getShoppingList() {
        return basketService.getShoppingList();
    }
}

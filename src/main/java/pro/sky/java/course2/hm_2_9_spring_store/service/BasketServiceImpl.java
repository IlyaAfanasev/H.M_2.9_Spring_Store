package pro.sky.java.course2.hm_2_9_spring_store.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.sky.java.course2.hm_2_9_spring_store.model.Basket;
import pro.sky.java.course2.hm_2_9_spring_store.model.Product;

import java.util.Collection;
import java.util.List;

@Service
@Scope(scopeName = "prototype")
public class BasketServiceImpl implements BasketService {


    private final Basket basket;


    public BasketServiceImpl(Basket basket) {

        this.basket = basket;
    }

    @Override
    public String addProductToBasket(List<Integer> idProducts) {
        basket.addOrderedProduct(idProducts);
        return "продукты добавлены в корзину";
    }

    @Override
    public Collection<Product> getShoppingList() {
        return basket.getOrderedProducts();

    }
}

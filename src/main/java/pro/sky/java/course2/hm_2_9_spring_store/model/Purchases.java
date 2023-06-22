package pro.sky.java.course2.hm_2_9_spring_store.model;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class Purchases {
    private final Map<Integer, Product> purchases;

    public Purchases() {
        this.purchases = new HashMap<>(Map.of(
                1, new Product("Футболка"),
                2, new Product("Бeйсболка"),
                3, new Product("Кроссовки"),
                4, new Product("Куртка"),
                5, new Product("Кофта"),
                6, new Product("Штаны")

        ));
    }


    public Map<Integer, Product> getPurchases() {
        return purchases;
    }


}

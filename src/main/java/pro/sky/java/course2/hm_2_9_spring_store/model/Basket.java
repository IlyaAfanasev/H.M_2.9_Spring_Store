package pro.sky.java.course2.hm_2_9_spring_store.model;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;


import java.util.ArrayList;
import java.util.List;

@Component

@SessionScope
public class Basket {
    private static Purchases purchases = new Purchases();

    private List<Product> orderedProducts;

    public Basket() {

        this.orderedProducts = new ArrayList<>();

    }

    public void addOrderedProduct(List<Integer> idProducts) {

        for (Integer i : idProducts) {
            if (!purchases.getPurchases().containsKey(i)) {
                throw new IllegalArgumentException();
            }
            orderedProducts.add(purchases.getPurchases().get(i));

        }
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }


}


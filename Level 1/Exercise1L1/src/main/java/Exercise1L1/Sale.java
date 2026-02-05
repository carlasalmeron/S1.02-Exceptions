package Exercise1L1;

import java.util.ArrayList;

public class Sale {

    ArrayList<Product> products = new ArrayList<>();
    double totalPrice = 0;

    void calculateTotal() {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }

}

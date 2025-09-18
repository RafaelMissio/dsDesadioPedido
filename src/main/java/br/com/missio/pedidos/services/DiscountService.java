package br.com.missio.pedidos.services;

import br.com.missio.pedidos.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {


    public double discount(Order order) {
        return order.getBasic() *  (order.getDiscount() /100);
    }
}

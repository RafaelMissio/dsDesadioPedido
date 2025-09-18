package br.com.missio.pedidos.services;


import br.com.missio.pedidos.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        if (isFreeShipping(order)) {
            return 0.0;
        } else if (order.getBasic() <= 100.0) {
            return 20;
        } else {
            return 12;
        }

    }

    private boolean isFreeShipping(Order order) {

        return order.getBasic() >= 200.0;
    }
}

package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    Double shipment(Order order) {
        if (order.getBasic() < 100.00) {
            return 20.00;
        } else if (order.getBasic() < 200.00) {
            return 12.00;
        }
        return 0.0;
    }
}

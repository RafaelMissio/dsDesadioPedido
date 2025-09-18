package br.com.missio.pedidos;

import br.com.missio.pedidos.entities.Order;
import br.com.missio.pedidos.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedidosApplication implements CommandLineRunner {


    private final OrderService orderService;

    public PedidosApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(PedidosApplication.class, args);
	}

    public void run(String... args) throws Exception {

        System.out.println("Exempo 1 ");
        var order1 = new Order(1034,150.0,20.0);
        System.out.printf("Pedido Código %d\nValor Total: R$ %.2f", order1.getCode(), orderService.total(order1));

        System.out.println();
        System.out.println();
        System.out.println("Exempo 2 ");
        var order2 = new Order(2282,800,10.0);
        System.out.printf("Pedido Código %d\nValor Total: R$ %.2f", order2.getCode(), orderService.total(order2));

        System.out.println();
        System.out.println();
        System.out.println("Exempo 3 ");
        var order3 = new Order(1309,95.90,0.0);
        System.out.printf("Pedido Código %d\nValor Total: R$ %.2f", order3.getCode(), orderService.total(order3));
        System.out.println();


    }

}

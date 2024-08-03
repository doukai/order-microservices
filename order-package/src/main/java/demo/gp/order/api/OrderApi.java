package demo.gp.order.api;

import demo.gp.order.dto.objectType.Order;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Source;

@ApplicationScoped
@GraphQLApi
public class OrderApi {

    public Float total(@Source Order order) {
        if (order.getItems().stream().anyMatch(orderItem -> orderItem.getQuantity() == 0)) {
            throw new RuntimeException("The quantity of the purchased product cannot 0");
        }
        return order.getItems().stream()
                .map(orderItem -> orderItem.getProduct().getPrice() + orderItem.getQuantity())
                .reduce(0.00f, Float::sum);
    }
}

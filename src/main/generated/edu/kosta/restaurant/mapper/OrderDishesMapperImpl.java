package edu.kosta.restaurant.mapper;

import edu.kosta.restaurant.domain.Dish;
import edu.kosta.restaurant.domain.OrderDishes;
import edu.kosta.restaurant.dto.OrderDishesInsertRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-09T21:52:38+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.7 (JetBrains s.r.o.)"
)
public class OrderDishesMapperImpl implements OrderDishesMapper {

    @Override
    public OrderDishes insertRequestToOrderDishes(OrderDishesInsertRequest orderDishesInsertRequest) {
        if ( orderDishesInsertRequest == null ) {
            return null;
        }

        OrderDishes orderDishes = new OrderDishes();

        orderDishes.setDishes( orderDishesInsertRequestToDish( orderDishesInsertRequest ) );
        orderDishes.setQuantity( orderDishesInsertRequest.getQuantity() );

        return orderDishes;
    }

    protected Dish orderDishesInsertRequestToDish(OrderDishesInsertRequest orderDishesInsertRequest) {
        if ( orderDishesInsertRequest == null ) {
            return null;
        }

        Dish dish = new Dish();

        if ( orderDishesInsertRequest.getDishId() != null ) {
            dish.setId( orderDishesInsertRequest.getDishId() );
        }

        return dish;
    }
}

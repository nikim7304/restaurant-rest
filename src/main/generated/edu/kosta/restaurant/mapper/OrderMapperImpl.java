package edu.kosta.restaurant.mapper;

import edu.kosta.restaurant.domain.Cook;
import edu.kosta.restaurant.domain.Order;
import edu.kosta.restaurant.domain.Tablet;
import edu.kosta.restaurant.dto.OrderInsertRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-15T20:52:29+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order insertRequestToOrder(OrderInsertRequest orderInsertRequest) {
        if ( orderInsertRequest == null ) {
            return null;
        }

        Order order = new Order();

        order.setCooks( orderInsertRequestToCook( orderInsertRequest ) );
        order.setTablets( orderInsertRequestToTablet( orderInsertRequest ) );

        return order;
    }

    protected Cook orderInsertRequestToCook(OrderInsertRequest orderInsertRequest) {
        if ( orderInsertRequest == null ) {
            return null;
        }

        Cook cook = new Cook();

        if ( orderInsertRequest.getCookId() != null ) {
            cook.setId( orderInsertRequest.getCookId() );
        }

        return cook;
    }

    protected Tablet orderInsertRequestToTablet(OrderInsertRequest orderInsertRequest) {
        if ( orderInsertRequest == null ) {
            return null;
        }

        Tablet tablet = new Tablet();

        if ( orderInsertRequest.getTabletId() != null ) {
            tablet.setId( orderInsertRequest.getTabletId() );
        }

        return tablet;
    }
}

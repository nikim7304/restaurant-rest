package edu.kosta.restaurant.mapper;

import edu.kosta.restaurant.domain.Dish;
import edu.kosta.restaurant.dto.DishUpdateRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-15T20:52:29+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
public class DishMapperImpl implements DishMapper {

    @Override
    public Dish updateRequestToDish(DishUpdateRequest dishUpdateRequest, Dish dish) {
        if ( dishUpdateRequest == null ) {
            return null;
        }

        if ( dishUpdateRequest.getName() != null ) {
            dish.setName( dishUpdateRequest.getName() );
        }
        dish.setCookingDuration( dishUpdateRequest.getCookingDuration() );
        dish.setPrice( dishUpdateRequest.getPrice() );

        return dish;
    }
}

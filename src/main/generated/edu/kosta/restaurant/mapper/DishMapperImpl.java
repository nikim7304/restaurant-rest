package edu.kosta.restaurant.mapper;

import edu.kosta.restaurant.domain.Dish;
import edu.kosta.restaurant.dto.DishUpdateRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-09T21:52:38+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.7 (JetBrains s.r.o.)"
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

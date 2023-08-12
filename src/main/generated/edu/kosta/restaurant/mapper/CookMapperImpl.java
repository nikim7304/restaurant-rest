package edu.kosta.restaurant.mapper;

import edu.kosta.restaurant.domain.Cook;
import edu.kosta.restaurant.dto.CookUpdateRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-12T23:01:40+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.7 (JetBrains s.r.o.)"
)
public class CookMapperImpl implements CookMapper {

    @Override
    public Cook updateRequestToCook(CookUpdateRequest cookUpdateRequest, Cook cook) {
        if ( cookUpdateRequest == null ) {
            return null;
        }

        if ( cookUpdateRequest.getFirstName() != null ) {
            cook.setFirstName( cookUpdateRequest.getFirstName() );
        }
        if ( cookUpdateRequest.getLastName() != null ) {
            cook.setLastName( cookUpdateRequest.getLastName() );
        }

        return cook;
    }
}

package edu.kosta.restaurant.repository;

import edu.kosta.restaurant.domain.Tablet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TabletRepository extends JpaRepository<Tablet, Long> {
    @Query(value = "select * from dual", nativeQuery = true)
    Long findDual(@Param("TEST") String test);
}

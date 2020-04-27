package sw2.clase03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sw2.clase03.entity.Shipper;

import java.util.List;

@Repository
public interface ShipperRepository extends JpaRepository<Shipper, Integer> {

    //Para el QueryMethods: JPQL
    List<Shipper> findByCompanyName(String name);
    //aquí no se definen métodos


    //Para Query
    @Query(value="select * from shippers where CompanyName=?1", nativeQuery=true)
    List<Shipper> buscarTransxNombre(String name);

}


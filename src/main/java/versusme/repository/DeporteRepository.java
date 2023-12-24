package versusme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import versusme.entity.Deporte;

@Repository
public interface DeporteRepository extends JpaRepository<Deporte, Long>{

}

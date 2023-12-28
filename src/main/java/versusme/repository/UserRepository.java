package versusme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import versusme.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

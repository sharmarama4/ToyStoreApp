package toy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toy.data.Toy;

@Repository
public interface ToyRepository extends JpaRepository<Toy,Integer> {

}

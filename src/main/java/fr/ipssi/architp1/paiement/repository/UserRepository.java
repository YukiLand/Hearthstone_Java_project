package fr.ipssi.architp1.paiement.repository;

import fr.ipssi.architp1.paiement.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}

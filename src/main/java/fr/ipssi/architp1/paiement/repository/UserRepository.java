package fr.ipssi.architp1.paiement.repository;

import fr.ipssi.architp1.paiement.domain.userInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<userInfo, Integer> {
}

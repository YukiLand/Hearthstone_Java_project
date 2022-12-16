package fr.ipssi.architp1.paiement.service;


import fr.ipssi.architp1.paiement.domain.User;
import fr.ipssi.architp1.paiement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user) {
        User savedEmployee = userRepository.save(user);
        return savedEmployee;
    }
}
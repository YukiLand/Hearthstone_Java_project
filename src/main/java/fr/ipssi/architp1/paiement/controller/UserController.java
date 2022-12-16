package fr.ipssi.architp1.paiement.controller;

import com.electronwill.nightconfig.core.conversion.Path;
import fr.ipssi.architp1.paiement.domain.userInfo;
import fr.ipssi.architp1.paiement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public userInfo save() {
        userInfo u = (userInfo) userRepository.findAll();
        return u;
    };

/*    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public userInfo save(@PathVariable int id) {
        userInfo u = userRepository.findById(id);
        return u;
    }*/

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public userInfo save(@RequestBody userInfo user) {
        userInfo u = userRepository.save(user);
        return u;
    }


}

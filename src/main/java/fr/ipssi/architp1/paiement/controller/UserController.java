package fr.ipssi.architp1.paiement.controller;

import fr.ipssi.architp1.paiement.domain.User;
import fr.ipssi.architp1.paiement.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<User> userInfo() {
        return new ResponseEntity<>( new User(), HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<User> userCreated() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        /*User newUser = UserService.create(user);*/
        return UserService.create(user);
    }


}

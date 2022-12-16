package fr.ipssi.architp1.user.controller;

import fr.ipssi.architp1.user.domain.User;
import fr.ipssi.architp1.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<User> userInfo(String userRef) {
        return new ResponseEntity<>( new User(), HttpStatus.OK);
    }

    &
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<User> userCreated(@RequestParam(required = true) String email, @RequestParam(required = true) String password) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

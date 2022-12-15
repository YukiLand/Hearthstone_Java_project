package fr.ipssi.architp1.user.controller;

import fr.ipssi.architp1.user.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<User> userInfo(String userRef) {
        return new ResponseEntity<>( new User(), HttpStatus.OK);
    }
}

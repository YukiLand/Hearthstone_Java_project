package fr.ipssi.architp1.paiement.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class AboutController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Bonjour", HttpStatus.OK);
    }

}

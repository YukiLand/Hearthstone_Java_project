package fr.ipssi.architp1.paiement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaiementController {
    @RequestMapping(value = "/paiement", method = RequestMethod.GET)
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Bonjour", HttpStatus.OK);
    }
}


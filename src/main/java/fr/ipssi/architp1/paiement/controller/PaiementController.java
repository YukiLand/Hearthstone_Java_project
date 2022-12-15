package fr.ipssi.architp1.paiement.controller;

import fr.ipssi.architp1.paiement.domain.PaiementResponse;
import fr.ipssi.architp1.paiement.domain.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaiementController {
    @RequestMapping(value = "/paiement/u/{userRef}", method = RequestMethod.POST)
    public ResponseEntity<PaiementResponse> pay(@RequestBody Product product, @PathVariable String userRef) {
        return new ResponseEntity<>( new PaiementResponse(), HttpStatus.OK);
    }
    @RequestMapping(value = "/paiement/i/{userRef}", method = RequestMethod.GET)
    public ResponseEntity<PaiementResponse> pay(@PathVariable String userRef) {
        return new ResponseEntity<>( new PaiementResponse(), HttpStatus.OK);
    }
}


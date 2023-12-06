package com.poja.prime.endpoint.rest.controller;;
import com.poja.prime.PojaGenerated;
import com.poja.prime.endpoint.event.gen.PrimeNumberGenerator;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;


@PojaGenerated
@RestController
@Value
public class PrimeNumberController {
    @GetMapping("/new-prime")
    public String newPrime() {
        BigInteger probablePrime = PrimeNumberGenerator.generateProbablePrime(1000, 50);
        return "Generated probable prime: " + probablePrime;
    }
}

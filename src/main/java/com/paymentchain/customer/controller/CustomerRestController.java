package com.paymentchain.customer.controller;

import com.paymentchain.customer.entities.Customer;
import com.paymentchain.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController /*help to show this to internet*/
@RequestMapping("/customer") /*definir una url del servicio*/
public class CustomerRestController {
    @Autowired /*Sirve para hacer la inyeccion, el framework lo hace*/
    CustomerRepository customerRepository; /*Inyeccion de depencdencias a customer repository*/

    @GetMapping
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
    @GetMapping("/{id}")
    public Customer get(@PathVariable Long id){
        return null;
    }
    @PutMapping("{id}")
    public Customer put(@PathVariable Long id, @RequestBody Customer input){
        return null;
    }
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Customer input){
        Customer save=customerRepository.save(input);
        return ResponseEntity.ok(save);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return null;
    }
}

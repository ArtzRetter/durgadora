package com.durga.locadora.controller;

import com.durga.locadora.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomersController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> createCustomer(
            @RequestParam(name = "name", required = true) String customerName,
            @RequestParam(name = "cpf", required = true) String cpf
    ){
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customerName,cpf));
    }
    @GetMapping(value = "/list")
    public ResponseEntity<?> customerList(){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomer());
    };
    @DeleteMapping(value = "/deletelist")
    public ResponseEntity deleteCustomerList(
            @RequestParam(name = "customerId", required = true) String customerId
    ){
        customerService.deleteList(customerId);
        return ResponseEntity.status(HttpStatus.OK).body("usuario deletado");
    }
}

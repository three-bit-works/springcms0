package com.stemizer.cms.controller;

import com.stemizer.cms.entity.Customer;
import com.stemizer.cms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController()
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/create")
    public String create(@RequestBody Customer customer){
        customerRepository.saveOrUpdate(customer);
        return  customer.toString();
    }

}

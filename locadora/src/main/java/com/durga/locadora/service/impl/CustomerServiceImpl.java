package com.durga.locadora.service.impl;

import com.durga.locadora.Customer;
import com.durga.locadora.service.CustomerService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@NoArgsConstructor
@Service
public abstract class CustomerServiceImpl implements CustomerService {

    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    @Override
    public ArrayList<Customer> createCustomer(String name, String cpf) {
                customerList.add(
                        Customer.builder()
                                .id(UUID.randomUUID())
                                .name(name)
                                .cpf(cpf)
                                .build()
                );
        return customerList;
    }

    @Override
    public ArrayList<Customer> getCustomer() {
        return customerList;
    }

    @Override
    public void deleteList(String customerId){
        for (Customer customer:customerList){
            if (customer.getId().equals(UUID.fromString(customerId))){
            customerList.remove(customer);
            }
        }
        };
}

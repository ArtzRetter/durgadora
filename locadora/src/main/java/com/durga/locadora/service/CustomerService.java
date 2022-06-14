package com.durga.locadora.service;

import com.durga.locadora.Customer;
import java.util.ArrayList;

public interface CustomerService {

    ArrayList<Customer> createCustomer(String name, String cpf);

    ArrayList<Customer> getCustomer();

    void deleteList(String customerId);

}

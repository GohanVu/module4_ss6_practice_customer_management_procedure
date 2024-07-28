package com.codegym.practice_customer_management_procedure.service;

import com.codegym.practice_customer_management_procedure.model.Customer;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}

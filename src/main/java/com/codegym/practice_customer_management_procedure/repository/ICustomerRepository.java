package com.codegym.practice_customer_management_procedure.repository;

import com.codegym.practice_customer_management_procedure.model.Customer;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure(Customer customer);
}
package com.cec.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("list")
public class CustomerListDataAccessService implements CustomerDao {
    //db
    private static List<Customer> customers;
    static {
        customers = new ArrayList<>();
        Customer alex = new Customer(
                "Alex",
                "alex@gmail.com",
                21
        );
        customers.add(alex);

        Customer amy = new Customer(
                "Amy",
                "amy@gmail.com",
                18
        );
        customers.add(amy);
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }
}

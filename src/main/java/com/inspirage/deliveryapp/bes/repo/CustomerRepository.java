package com.inspirage.deliveryapp.bes.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.inspirage.deliveryapp.bes.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long>{
	List<Customer> findByLastName(String lastName);
}

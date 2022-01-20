package org.capgemini.repository;

import org.capgemini.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//getting the information from JpaRepository  
public interface CustomerRepository extends JpaRepository<Customer,String> {

}


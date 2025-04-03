package org.equinox.paymentchain.repository;

import org.equinox.paymentchain.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}

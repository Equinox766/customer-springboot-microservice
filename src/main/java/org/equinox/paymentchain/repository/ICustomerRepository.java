package org.equinox.paymentchain.repository;

import org.equinox.paymentchain.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT c FROM Customer c WHERE c.code = :code")
    public Customer findByCode(String code);

    @Query("SELECT c FROM Customer c WHERE c.iban = :account")
    public Customer findByAccount(String account);
}

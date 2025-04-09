package org.equinox.paymentchain.repository;

import org.equinox.paymentchain.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT c FROM Customer c WHERE c.code = :code")
//    Customer findByCode(String code);
    Customer findByCode(@Param("code") String code);

    @Query("SELECT c FROM Customer c WHERE c.iban = :account")
    Customer findByAccount(String account);
}

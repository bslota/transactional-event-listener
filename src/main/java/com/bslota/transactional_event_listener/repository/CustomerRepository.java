package com.bslota.transactional_event_listener.repository;

import com.bslota.transactional_event_listener.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bslota on 30.06.17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

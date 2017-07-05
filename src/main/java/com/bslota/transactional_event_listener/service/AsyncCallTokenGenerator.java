package com.bslota.transactional_event_listener.service;

import com.bslota.transactional_event_listener.model.Customer;
import com.bslota.transactional_event_listener.repository.CustomerRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by bslota on 03.07.17.
 */
@Service
@Profile("async")
public class AsyncCallTokenGenerator implements TokenGenerator {

    private final CustomerRepository customerRepository;

    public AsyncCallTokenGenerator(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void generateToken(Customer customer) {
        final String token = String.valueOf(customer.hashCode());
        customer.activatedWith(token);
        customerRepository.save(customer);
    }
}

package com.bslota.transactional_event_listener.service;

import com.bslota.transactional_event_listener.model.Customer;
import com.bslota.transactional_event_listener.repository.CustomerRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bslota on 03.07.17.
 */
@Service
@Profile("!async")
public class DefaultTokenGenerator implements TokenGenerator {

    private final CustomerRepository customerRepository;

    public DefaultTokenGenerator(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void generateToken(Customer customer) {
        final String token = String.valueOf(customer.hashCode());
        customer.activatedWith(token);
        customerRepository.save(customer);
    }
}

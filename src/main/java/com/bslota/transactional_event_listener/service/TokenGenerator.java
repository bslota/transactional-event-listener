package com.bslota.transactional_event_listener.service;

import com.bslota.transactional_event_listener.model.Customer;

/**
 * Created by bslota on 03.07.17.
 */
public interface TokenGenerator {

    void generateToken(Customer customer);
}

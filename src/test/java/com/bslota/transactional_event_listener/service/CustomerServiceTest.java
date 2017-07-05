package com.bslota.transactional_event_listener.service;

import com.bslota.transactional_event_listener.model.Customer;
import com.bslota.transactional_event_listener.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by bslota on 01.07.17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void shouldPersistCustomerWithToken() throws Exception {
        //when
        final Customer returnedCustomer = customerService.createCustomer("Matt", "matt@gmail.com");

        //then
        final Customer persistedCustomer = customerRepository.findOne(returnedCustomer.getId());
        assertEquals("matt@gmail.com", returnedCustomer.getEmail());
        assertEquals("Matt", returnedCustomer.getName());
        assertTrue(returnedCustomer.hasToken());
        assertEquals(returnedCustomer, persistedCustomer);
    }


}
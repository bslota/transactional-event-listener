package com.bslota.transactional_event_listener.event;

import com.bslota.transactional_event_listener.model.Customer;

/**
 * Created by bslota on 30.06.17.
 */
public class CustomerCreatedEvent {

  private final Customer customer;

  public CustomerCreatedEvent(Customer customer) {
    this.customer = customer;
  }

  public Customer getCustomer() {
    return customer;
  }

  @Override
  public String toString() {
    return "CustomerCreatedEvent{" +
      "customer=" + customer +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CustomerCreatedEvent that = (CustomerCreatedEvent) o;

    return customer.equals(that.customer);
  }

  @Override
  public int hashCode() {
    return customer.hashCode();
  }
}

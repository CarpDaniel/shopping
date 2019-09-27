package ro.msg.learning.shopping.repository;

import org.springframework.data.repository.Repository;
import ro.msg.learning.shopping.entity.Customer;

import java.util.List;

public interface CustomerRepository extends Repository<Customer, Long> {

  List<Customer> findAll();
}

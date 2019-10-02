package ro.msg.learning.shopping.repository;

import org.springframework.data.repository.CrudRepository;
import ro.msg.learning.shopping.entity.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findAll();
}

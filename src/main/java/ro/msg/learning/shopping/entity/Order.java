package ro.msg.learning.shopping.entity;

import lombok.Data;
import ro.msg.learning.shopping.embeddable.Address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Order implements Serializable {

  @Id
  @GeneratedValue
  private Long id;

  private Location shippedFrom;
  private Customer customer;
  private Address address;
}

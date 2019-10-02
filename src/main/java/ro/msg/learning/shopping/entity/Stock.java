package ro.msg.learning.shopping.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Stock implements Serializable {

  @Id
  @GeneratedValue
  private Long id;

  private Product product;
  private Location location;
  private Integer quantity;
}

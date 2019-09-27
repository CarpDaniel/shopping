package ro.msg.learning.shopping.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
public class Stock implements Serializable {

  private Product product;
  private Location location;
  private Integer quantity;
}

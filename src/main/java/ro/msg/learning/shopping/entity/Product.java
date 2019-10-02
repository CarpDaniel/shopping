package ro.msg.learning.shopping.entity;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Product implements Serializable {

  @Id
  @GeneratedValue
  private Long id;

  private String name;
  private String description;
  private Double price;
  private Double weight;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "product_category_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private ProductCategory productCategory;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "supplier_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private Supplier supplier;
}

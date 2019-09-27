package ro.msg.learning.shopping.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Address implements Serializable {

  private String country;
  private String city;
  private String county;
  private String street;
  private int streetNumber;
}

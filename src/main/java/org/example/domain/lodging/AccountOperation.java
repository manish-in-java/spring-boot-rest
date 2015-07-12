package org.example.domain.lodging;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "account_operation")
public class AccountOperation implements Serializable
{
  @Column(name = "id", nullable = false, updatable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Long id;

  @JoinColumn(name = "lodger_id", updatable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  private Lodger lodger;

  AccountOperation()
  {
    super();
  }

  public AccountOperation(final Lodger lodger)
  {
    this();

    this.lodger = lodger;
  }

  public Long getID()
  {
    return id;
  }

  public Lodger getLodger()
  {
    return lodger;
  }
}

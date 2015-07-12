package org.example.domain.lodging;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lodger")
public class Lodger implements Serializable
{
  @Column(name = "id", nullable = false, updatable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Long id;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "lodger")
  private List<AccountOperation> accountOperations;

  public void addAccountOperation(final AccountOperation accountOperation)
  {
    if (accountOperations == null)
    {
      accountOperations = new ArrayList<AccountOperation>();
    }

    accountOperations.add(accountOperation);
  }

  public List<AccountOperation> getAccountOperations()
  {
    return accountOperations;
  }

  public Long getID()
  {
    return id;
  }
}

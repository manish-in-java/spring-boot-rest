package org.example.data.lodging;

import org.example.Application;
import org.example.data.lodging.lodging.LodgerRepository;
import org.example.domain.lodging.AccountOperation;
import org.example.domain.lodging.Lodger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class LodgerRepositoryTest
{
  @Autowired
  private LodgerRepository repository;

  @Before
  public void setup()
  {
    for (int i = 1; i < 10 + new Random().nextInt(10); ++i)
    {
      final Lodger lodger = new Lodger();

      for (int j = 1; j < 5 + new Random().nextInt(5); ++j)
      {
        lodger.addAccountOperation(new AccountOperation(lodger));
      }

      repository.saveAndFlush(lodger);
    }
  }

  @Test
  public void testFindAll()
  {
    final List<Lodger> lodgers = repository.findAll();

    assertNotNull(lodgers);
    assertNotEquals(0, lodgers.size());

    for (final Lodger lodger : lodgers)
    {
      assertNotNull(lodger);
      assertNotNull(lodger.getAccountOperations());
      assertNotEquals(0, lodger.getAccountOperations().size());
      assertNotNull(lodger.getID());

      for (final AccountOperation accountOperation : lodger.getAccountOperations())
      {
        assertNotNull(accountOperation);
        assertNotNull(accountOperation.getID());
        assertNotNull(accountOperation.getLodger());
        assertEquals(lodger, accountOperation.getLodger());
      }
    }
  }
}

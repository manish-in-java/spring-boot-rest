package org.example.data.lodging.lodging;

import org.example.domain.lodging.Lodger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LodgerRepository extends JpaRepository<Lodger, Long>
{
}

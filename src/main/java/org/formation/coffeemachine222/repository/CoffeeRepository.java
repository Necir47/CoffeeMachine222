package org.formation.coffeemachine222.repository;

import org.formation.coffeemachine222.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long>  {
}

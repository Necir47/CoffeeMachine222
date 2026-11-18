package org.formation.coffeemachine222.service;

import org.formation.coffeemachine222.dto.CoffeeCreateDto;
import org.formation.coffeemachine222.dto.CoffeeDto;
import org.formation.coffeemachine222.entity.Coffee;

import java.util.List;
import java.util.Optional;

public interface CoffeeService {
    List<CoffeeDto> allCoffees();
    Optional<CoffeeDto> oneCoffee(Long id);
    CoffeeDto create(CoffeeCreateDto dto);
    /// update

 }

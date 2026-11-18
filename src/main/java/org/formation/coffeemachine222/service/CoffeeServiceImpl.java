package org.formation.coffeemachine222.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.formation.coffeemachine222.dto.CoffeeCreateDto;
import org.formation.coffeemachine222.dto.CoffeeDto;
import org.formation.coffeemachine222.entity.Coffee;
import org.formation.coffeemachine222.mapper.CoffeeMapper;
import org.formation.coffeemachine222.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeRepository repository;
    private final CoffeeMapper mapper;


    @PostConstruct
    void initDb(){
        repository.saveAll(List.of(
                new Coffee("Expresso", 98),
                new Coffee("Latte", 76),
                new Coffee("Robusta", 54)

        ));
    }


    @Override
    public List<CoffeeDto> allCoffees() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public Optional<CoffeeDto> oneCoffee(Long id) {
        return repository.findById(id).map(mapper::toDto);
    }

    @Override
    public CoffeeDto create(CoffeeCreateDto dto) {
        Coffee entity = mapper.toEntity(dto);
        Coffee saved = repository.save(entity);
        return mapper.toDto(saved);
    }


}

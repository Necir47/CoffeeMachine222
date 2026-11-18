package org.formation.coffeemachine222.mapper;

import org.formation.coffeemachine222.dto.CoffeeCreateDto;
import org.formation.coffeemachine222.dto.CoffeeDto;
import org.formation.coffeemachine222.entity.Coffee;
import org.hibernate.annotations.MapKeyCompositeType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CoffeeMapper {
    CoffeeDto toDto(Coffee coffee);

    @Mapping(target = "id", ignore = true)
    Coffee toEntity(CoffeeCreateDto dto);

}

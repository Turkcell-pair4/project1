package com.turkcell.pairproject1.mappers;

import com.turkcell.pairproject1.dtos.requests.BasketRequests.BasketSaveRequest;
import com.turkcell.pairproject1.dtos.requests.BasketRequests.BasketUpdateRequest;
import com.turkcell.pairproject1.entities.Basket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BasketMapper {
    BasketMapper INSTANCE = Mappers.getMapper(BasketMapper.class);

    Basket convertToBasket(BasketSaveRequest request);

    @Mapping(target = "id", ignore = true)
    void updateBasketFields(@MappingTarget Basket basket, BasketUpdateRequest request);
}

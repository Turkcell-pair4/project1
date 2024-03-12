package com.turkcell.pairproject1.mappers;

import com.turkcell.pairproject1.dtos.requests.BasketItemRequests.BasketItemSaveRequest;
import com.turkcell.pairproject1.dtos.requests.BasketItemRequests.BasketItemUpdateRequest;
import com.turkcell.pairproject1.entities.BasketItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BasketItemMapper {

    BasketItemMapper INSTANCE = Mappers.getMapper(BasketItemMapper.class);

    BasketItem convertToBasketItem(BasketItemSaveRequest request);

    @Mapping(target = "id", ignore = true)
    void updateBasketItemFields(@MappingTarget BasketItem basketItem, BasketItemUpdateRequest request);
}

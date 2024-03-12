package com.turkcell.pairproject1.mappers;

import com.turkcell.pairproject1.dtos.requests.OrderRequests.OrderSaveRequest;
import com.turkcell.pairproject1.dtos.requests.OrderRequests.OrderUpdateRequest;
import com.turkcell.pairproject1.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order convertToOrder(OrderSaveRequest request);

    @Mapping(target = "id", ignore = true)
    void updateOrderFields(@MappingTarget Order order, OrderUpdateRequest request);
}

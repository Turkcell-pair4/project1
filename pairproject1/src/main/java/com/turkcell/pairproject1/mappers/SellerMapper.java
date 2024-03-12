package com.turkcell.pairproject1.mappers;

import com.turkcell.pairproject1.dtos.requests.SellerRequests.SellerSaveRequest;
import com.turkcell.pairproject1.dtos.requests.SellerRequests.SellerUpdateRequest;
import com.turkcell.pairproject1.entities.Seller;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mapstruct.MappingTarget;
@Mapper
public interface SellerMapper {

    SellerMapper INSTANCE = Mappers.getMapper(SellerMapper.class);

    Seller convertToSeller(SellerSaveRequest request);

    @Mapping(target = "id", ignore = true)
    void updateSellerFields(@MappingTarget Seller seller, SellerUpdateRequest request);

}

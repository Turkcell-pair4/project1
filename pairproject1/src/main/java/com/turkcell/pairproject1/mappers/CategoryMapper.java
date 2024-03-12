package com.turkcell.pairproject1.mappers;

import com.turkcell.pairproject1.dtos.requests.BasketRequests.BasketSaveRequest;
import com.turkcell.pairproject1.dtos.requests.BasketRequests.BasketUpdateRequest;
import com.turkcell.pairproject1.dtos.requests.CategoryRequests.CategorySaveRequest;
import com.turkcell.pairproject1.dtos.requests.CategoryRequests.CategoryUpdateRequest;
import com.turkcell.pairproject1.entities.Basket;
import com.turkcell.pairproject1.entities.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    Category convertToCategory(CategorySaveRequest request);

    @Mapping(target = "id", ignore = true)
    void updateCategoryFields(@MappingTarget Category category, CategoryUpdateRequest request);
}

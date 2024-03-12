package com.turkcell.pairproject1.mappers;

import com.turkcell.pairproject1.dtos.requests.ReviewRequests.ReviewSaveRequest;
import com.turkcell.pairproject1.dtos.requests.ReviewRequests.ReviewUpdateRequest;
import com.turkcell.pairproject1.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReviewMapper {

    ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);

    Review convertToReview(ReviewSaveRequest request);

    @Mapping(target = "id", ignore = true)
    void updateReviewFields(@MappingTarget Review review, ReviewUpdateRequest request);

}

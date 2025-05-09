package com.criativy.salao_api.mapper;

import com.criativy.salao_api.dto.UserFeedbackDto;
import com.criativy.salao_api.model.UserFeedback;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserFeedbackMapper {

    UserFeedbackMapper INSTANCE = Mappers.getMapper(UserFeedbackMapper.class);

    UserFeedbackDto toDTO(UserFeedback userFeedback);

    UserFeedback toEntity(UserFeedbackDto dto);
}

package com.criativy.salao_api.service;

import com.criativy.salao_api.dto.UserFeedbackDto;
import com.criativy.salao_api.mapper.UserFeedbackMapper;
import com.criativy.salao_api.model.UserFeedback;
import com.criativy.salao_api.repository.UserFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserFeedBackService {

    private final UserFeedbackRepository repository;
    private final UserFeedbackMapper mapper;

    @Autowired
    public UserFeedBackService(UserFeedbackRepository repository, UserFeedbackMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public UserFeedbackDto save(UserFeedbackDto dto) {
        UserFeedback userFeedback = repository.save(mapper.toEntity(dto));
        return mapper.toDTO(userFeedback);
    }

    public Page<UserFeedbackDto> findAll(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size, Sort.Direction.DESC, "id");
        return repository.findAll(pageable)
                .map(mapper::toDTO);
    }
}

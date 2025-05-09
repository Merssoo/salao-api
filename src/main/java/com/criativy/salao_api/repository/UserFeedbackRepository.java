package com.criativy.salao_api.repository;

import com.criativy.salao_api.model.UserFeedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFeedbackRepository extends JpaRepository<UserFeedback, Long> {
}

package com.lyh.repository;

import com.lyh.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
    Visitor findByIp(String ip);
}

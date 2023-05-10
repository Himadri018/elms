package com.RL.RegLog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.RL.RegLog.Entity.Leave_type;

@EnableJpaRepositories
@Repository
public interface LeavetypeRepo extends JpaRepository<Leave_type, Integer>{

}

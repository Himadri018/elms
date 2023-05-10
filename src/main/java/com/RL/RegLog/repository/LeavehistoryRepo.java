package com.RL.RegLog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.RL.RegLog.Entity.Leave_history;

@EnableJpaRepositories
@Repository
public interface LeavehistoryRepo extends JpaRepository<Leave_history, Integer> {

}

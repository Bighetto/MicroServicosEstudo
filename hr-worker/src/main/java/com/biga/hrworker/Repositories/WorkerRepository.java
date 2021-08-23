package com.biga.hrworker.Repositories;

import com.biga.hrworker.Entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}

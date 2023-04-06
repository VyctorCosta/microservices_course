package com.vyctor.hrworker.services;

import com.vyctor.hrworker.exceptions.ResourceNotFoundException;
import com.vyctor.hrworker.models.Worker;
import com.vyctor.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    WorkerRepository repository;

    public List<Worker> findAllWorkers() {
        return repository.findAll();
    }

    public Worker findWorkerById(Long id) {
        Optional<Worker> worker = repository.findById(id);

        return worker.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}

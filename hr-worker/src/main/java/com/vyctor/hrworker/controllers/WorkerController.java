package com.vyctor.hrworker.controllers;

import com.vyctor.hrworker.models.Worker;
import com.vyctor.hrworker.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    @Autowired
    WorkerService service;

    @GetMapping
    public ResponseEntity<List<Worker>> getAllWorkers() {
        List<Worker> workers = service.findAllWorkers();

        return ResponseEntity.ok().body(workers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> getWorkerById(@PathVariable Long id) {
        Worker worker = service.findWorkerById(id);
        return ResponseEntity.ok().body(worker);
    }
}

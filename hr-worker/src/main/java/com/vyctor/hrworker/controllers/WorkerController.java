package com.vyctor.hrworker.controllers;

import com.vyctor.hrworker.models.Worker;
import com.vyctor.hrworker.services.WorkerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    private static final Logger logger = LoggerFactory.getLogger(WorkerController.class);

    @Autowired
    private Environment env;

    @Autowired
    WorkerService service;

    @GetMapping
    public ResponseEntity<List<Worker>> getAllWorkers() {
        List<Worker> workers = service.findAllWorkers();

        return ResponseEntity.ok().body(workers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> getWorkerById(@PathVariable Long id) {
        logger.info("PORT = " + env.getProperty("local.server.port"));

        Worker worker = service.findWorkerById(id);
        return ResponseEntity.ok().body(worker);
    }
}

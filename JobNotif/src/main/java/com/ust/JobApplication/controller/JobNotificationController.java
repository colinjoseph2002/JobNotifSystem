package com.ust.JobApplication.controller;


import com.ust.JobApplication.model.JobInfo;
import com.ust.JobApplication.service.JobNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.LongAccumulator;

@RestController
@RequestMapping("/ust")
public class JobNotificationController {
    @Autowired
    private JobNotificationService service;

    //POST to create a new job notification.
    @PostMapping("/add job")
    public JobInfo addjob (@RequestBody JobInfo info) {
        return service.addjob(info);
    }

    //GET to retrieve all job notifications.
    @GetMapping("/get job")
    public List<JobInfo> getjob() {
        return service.getjob();
    }

    //GET by job ID to retrieve a specific job notification.
    @GetMapping("/get job/{id}")
    public JobInfo getjobbyid(@PathVariable Long id) {
        return service.getjobbyid(id);
    }
}

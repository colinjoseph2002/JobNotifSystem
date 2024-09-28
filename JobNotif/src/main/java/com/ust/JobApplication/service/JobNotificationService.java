package com.ust.JobApplication.service;

import com.ust.JobApplication.model.JobInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ust.JobApplication.repository.JobNotificationRepo;
import java.util.List;

@Service
public class JobNotificationService {
    @Autowired
    private JobNotificationRepo repo;

    public JobInfo addjob(JobInfo info) {
        return repo.save(info);
    }

    public List<JobInfo> getjob() {
        return repo.findAll();
    }

    public JobInfo getjobbyid(Long id) {
        return repo.findById(id).orElse(null);
    }

}

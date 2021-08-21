package com.example.demo.service;

import com.example.demo.entity.Application;

public interface IApplicationService {
    boolean addApplication(Application application);

    Application getApplicationById(int applicationId);

    void updateApplication(Application application);

    void deleteApplication(int applicationId);
}

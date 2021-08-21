package com.example.demo.service;

public interface IReleaseService {
    void addRelease(com.example.demo.entity.Release release);

    void addApplication(Integer appId, Integer releaseId);
}

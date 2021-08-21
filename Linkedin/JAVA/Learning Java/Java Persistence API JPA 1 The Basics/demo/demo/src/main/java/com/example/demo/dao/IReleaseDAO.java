package com.example.demo.dao;

import com.example.demo.entity.Release;

public interface IReleaseDAO {
    void addRelease(Release release);

    void addApplication(Integer appId, Integer releaseId);

    Release getReleaseById(int releaseId);
}

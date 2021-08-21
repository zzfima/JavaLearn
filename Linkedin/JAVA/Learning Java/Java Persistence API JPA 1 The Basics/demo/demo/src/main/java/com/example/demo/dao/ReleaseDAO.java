package com.example.demo.dao;

import com.example.demo.entity.Application;
import com.example.demo.entity.Release;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Repository
public class ReleaseDAO implements IReleaseDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private IApplicationDAO applicationDAO;

    @Override
    public void addRelease(Release release) {
        entityManager.persist(release);
    }

    @Override
    public void addApplication(Integer appId, Integer releaseId) {
        Release release = getReleaseById(releaseId);
        Application application = applicationDAO.getApplicationById(appId);
        release.addApplication(application);
        entityManager.flush();
    }

    @Override
    public Release getReleaseById(int releaseId) {
        return entityManager.find(Release.class, releaseId);
    }
}

package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.DaoInterface;
import com.tytarenko.hospitalautomatisation.entities.Recommendation;
import com.tytarenko.hospitalautomatisation.services.interfaces.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceImpl implements ServiceInterface<Recommendation> {

    @Autowired
    private DaoInterface<Recommendation> recommendationDao;

    @Override
    public List<Recommendation> get(String passport) {
        return recommendationDao.get(passport);
    }

    @Override
    public List<Recommendation> getByReception(long id) {
        return recommendationDao.getByReception(id);
    }

    @Override
    public void add(Recommendation object) {
        recommendationDao.add(object);
    }
}

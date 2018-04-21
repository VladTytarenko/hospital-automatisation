package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.DaoInteface;
import com.tytarenko.hospitalautomatisation.entities.Recommendation;
import com.tytarenko.hospitalautomatisation.services.interfaces.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService implements ServiceInterface<Recommendation> {

    @Autowired
    private DaoInteface<Recommendation> recomendationDao;

    @Override
    public List<Recommendation> get(long id) {
        return recomendationDao.get(id);
    }

    @Override
    public void add(Recommendation recommendation) {
        recomendationDao.add(recommendation);
    }
}

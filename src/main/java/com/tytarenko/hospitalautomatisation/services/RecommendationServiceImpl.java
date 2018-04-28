package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.entities.Recommendation;
import com.tytarenko.hospitalautomatisation.services.interfaces.ServiceInteface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecommendationServiceImpl implements ServiceInteface<Recommendation> {

    @Autowired
    private ServiceInteface<Recommendation> recommendationService;

    @Override
    public List<Recommendation> get(String passport) {
        return recommendationService.get(passport);
    }

    @Override
    public List<Recommendation> getByReception(long id) {
        return recommendationService.getByReception(id);
    }

    @Override
    public void add(Recommendation object) {
        recommendationService.add(object);
    }
}

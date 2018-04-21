package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.DaoInteface;
import com.tytarenko.hospitalautomatisation.entities.Recipe;
import com.tytarenko.hospitalautomatisation.services.interfaces.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService implements ServiceInterface<Recipe> {

    @Autowired
    private DaoInteface<Recipe> resipeDao;

    @Override
    public List<Recipe> get(long id) {
        return resipeDao.get(id);
    }

    @Override
    public void add(Recipe recipe) {
        resipeDao.add(recipe);
    }
}

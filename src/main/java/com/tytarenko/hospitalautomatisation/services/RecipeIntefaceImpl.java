package com.tytarenko.hospitalautomatisation.services;


import com.tytarenko.hospitalautomatisation.dao.interfaces.DaoInterface;
import com.tytarenko.hospitalautomatisation.entities.Recipe;
import com.tytarenko.hospitalautomatisation.services.interfaces.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeIntefaceImpl implements ServiceInterface<Recipe> {

    @Autowired
    private DaoInterface<Recipe> recipeDao;

    @Override
    public List<Recipe> get(String passport) {
        return recipeDao.get(passport);
    }

    @Override
    public List<Recipe> getByReception(long id) {
        return recipeDao.getByReception(id);
    }

    @Override
    public void add(Recipe object) {
        recipeDao.add(object);
    }
}

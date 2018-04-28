package com.tytarenko.hospitalautomatisation.services;


import com.tytarenko.hospitalautomatisation.dao.interfaces.DaoInteface;
import com.tytarenko.hospitalautomatisation.entities.Recipe;
import com.tytarenko.hospitalautomatisation.services.interfaces.ServiceInteface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecipeIntefaceImpl implements ServiceInteface<Recipe> {

    @Autowired
    private DaoInteface<Recipe> recipeDao;

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

package com.greenfox.repositories;

import com.greenfox.models.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by K on 2017.06.01..
 */
@Repository
public interface MealRepository extends CrudRepository<Meal, Long> {

}

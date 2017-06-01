package com.greenfox.repositories;

import com.greenfox.models.MealType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by K on 2017.06.01..
 */
@Repository
public interface MealTypeRepository extends CrudRepository<MealType, Long> {

}

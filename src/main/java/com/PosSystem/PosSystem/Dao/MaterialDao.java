package com.PosSystem.PosSystem.Dao;

import com.PosSystem.PosSystem.Model.Material;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MaterialDao extends CrudRepository<Material, Integer> {
    Material findByName(String name);
    Material findByNameAndStatus(String name, int status);
    List<Material> findByNameNotLike(String name);
    List<Material> findByNameContaining(String name);
}

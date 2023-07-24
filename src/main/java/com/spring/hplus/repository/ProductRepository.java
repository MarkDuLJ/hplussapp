package com.spring.hplus.repository;

import com.spring.hplus.beans.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    @Query("select p from p where p.name like %:name%")
    public List<Product> serachByName(@Param("name") String name);
}

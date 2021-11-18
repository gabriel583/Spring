package com.gdev.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gdev.myfirstproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {


}
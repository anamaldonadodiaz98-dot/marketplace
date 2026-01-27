package com.meli.marketplace.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.meli.marketplace.models.Category;

public interface CategoriesRepository extends JpaRepository<Category, Long> {

}

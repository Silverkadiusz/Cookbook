package com.example.cookbook.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

public interface RecipeRepository extends JpaRepository<Task, Long> {
}

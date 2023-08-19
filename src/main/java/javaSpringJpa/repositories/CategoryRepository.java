package javaSpringJpa.repositories;

import javaSpringJpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//contoh cara pembuatan repository.
@Repository
public interface  CategoryRepository extends JpaRepository<Category, String> {
}

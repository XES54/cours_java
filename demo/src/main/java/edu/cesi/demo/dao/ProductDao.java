package edu.cesi.demo.dao;

import edu.cesi.demo.model.Product;
import edu.cesi.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // crée une dépendance -> crée une classe à partir de l'interface UserDao
public interface ProductDao extends JpaRepository<Product, Integer> {
}
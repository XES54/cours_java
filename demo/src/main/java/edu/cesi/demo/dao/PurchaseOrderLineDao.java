package edu.cesi.demo.dao;

import edu.cesi.demo.model.Product;
import edu.cesi.demo.model.PurchaseOrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // crée une dépendance -> crée une classe à partir de l'interface UserDao
public interface PurchaseOrderLineDao extends JpaRepository<PurchaseOrderLine, Integer> {
}
package com.turkcell.pairproject1.repositories;

import com.turkcell.pairproject1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByCategoryId(int categoryId);

    @Query(value = "UPDATE Product p SET p.stock = :stock WHERE p.id = :productId")
    Product updateStock(int stock, int productId);

    @Query(value = "SELECT p FROM Product p ORDER BY p.unitPrice DESC")
    Product findMostValuableProduct();

    @Query(value = "SELECT SUM(p.stock) FROM Product p WHERE p.category.id = :id")
    int findTotalStockByCategoryId(int id);


}

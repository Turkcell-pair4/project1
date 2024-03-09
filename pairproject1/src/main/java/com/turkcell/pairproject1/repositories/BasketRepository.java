package com.turkcell.pairproject1.repositories;

import com.turkcell.pairproject1.entities.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends JpaRepository<Basket,Integer> {
}

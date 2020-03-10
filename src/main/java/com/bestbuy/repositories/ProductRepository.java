package com.bestbuy.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bestbuy.entities.ProductEntity;

@Repository
public class ProductRepository {

	private EntityManager entityManager;
	
	@Transactional
	public void save(ProductEntity product) {
		entityManager.persist(product);
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}

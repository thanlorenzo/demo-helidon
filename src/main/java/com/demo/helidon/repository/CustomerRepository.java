package com.demo.helidon.repository;

import com.demo.helidon.config.DataSourceConfig;
import com.demo.helidon.entity.Customer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class CustomerRepository {

    @RequestScoped
    @PersistenceContext
    private static EntityManager entityManager;

    private DataSourceConfig dataSourceConfig;

    @Inject
    public CustomerRepository(DataSourceConfig dataSourceConfig) {
        Map<String, Object> configOverrides = new HashMap<String, Object>();
        configOverrides.put("hibernate.connection.url", dataSourceConfig.getUrl());
        configOverrides.put("hibernate.connection.username", dataSourceConfig.getUserName());
        configOverrides.put("hibernate.connection.password", dataSourceConfig.getPassword());
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer", configOverrides);
        entityManager = emf.createEntityManager();
    }

    public List<Customer> findAll() {
        return entityManager.createQuery("from Customer").getResultList();
    }
}

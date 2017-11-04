package com.group1.quizgen.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseDaoImpl {
    @PersistenceContext
    protected EntityManager entityManager;
}

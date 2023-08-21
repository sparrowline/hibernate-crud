package com.jsp.EmployeeDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.EmployeeDto.Employee;

public class EmployeeDao {

	public Employee saveEmployee(Employee employee) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (employee != null) {
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();
			return employee;
		}
		return null;

	}

	public Employee updateEmployee(Employee employee) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee2 = entityManager.find(Employee.class, employee.getId());

		if (employee2 != null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			return employee2;
		}
		return employee;

	}

	public Employee delete(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
		return null;
	}

	public Employee getById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		return entityManager.find(Employee.class, id);

	}

	public List<Employee> getAll() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery(" select a from Employee a ");

		return query.getResultList();

	}

	public Employee login(String email, int password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select a from Employee a where email=?1 and password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);

		List<Employee> list = query.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	public Employee getEmployeeByEmailAndPassword(String email, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select p from User p where userEmail=?1 and userPassword=?2 ");

		query.setParameter(1, email);
		query.setParameter(2, password);

		List<Employee> list = query.getResultList();// converting query object into list form by using getResultList().
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}

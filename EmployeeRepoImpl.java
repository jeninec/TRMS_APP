package dev.clay.repos;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dev.clay.models.Employee;
import dev.clay.util.HibernateUtil;

public class EmployeeRepoImpl implements EmployeeRepo {

	@Override
	public Employee getEmployee(int id) {
		Session sess = HibernateUtil.getSession();
		Employee em = null;
		
		try {
			em = sess.get(Employee.class, id);
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		Session sess = HibernateUtil.getSession();
		List<Employee> employees = null;
		
		try {
			employees = sess.createQuery("FROM Employee").list();
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return employees;
	}

	@Override
	public Employee addEmployee(Employee em) {
		Session sess = HibernateUtil.getSession();
		
		try {
			sess.beginTransaction();
			em.setId((int)sess.save(em));
			sess.getTransaction().commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			sess.getTransaction().rollback();
			em = null;
		} finally {
			sess.close();
		}
		
		return em;
	}

	@Override
	public Employee updateEmployee(Employee change) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		
		try {
			tx = sess.beginTransaction();
			sess.update(change);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return change;
	}

	@Override
	public Employee deleteEmployee(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		Employee em = sess.get(Employee.class, id);
		
		try {
			tx = sess.beginTransaction();
			sess.delete(em);
			tx.commit();
			
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return em;
	}

}

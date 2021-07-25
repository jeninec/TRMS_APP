package dev.clay.repos;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dev.clay.models.Request;
import dev.clay.util.HibernateUtil;

public class RequestRepoImpl implements RequestRepo {

	@Override
	public Request getRequest(int id) {
		Session sess = HibernateUtil.getSession();
		Request rq = null;
		
		try {
			rq = sess.get(Request.class, id);
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return rq;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Request> getAllRequests() {
		Session sess = HibernateUtil.getSession();
		List<Request> requests = null;
		
		try {
			requests = sess.createQuery("FROM Request").list();
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return requests;
	}

	@Override
	public Request addRequest(Request rq) {
		Session sess = HibernateUtil.getSession();
		
		try {
			sess.beginTransaction();
			rq.setId((int)sess.save(rq));
			sess.getTransaction().commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			sess.getTransaction().rollback();
			rq = null;
		} finally {
			sess.close();
		}
		
		return rq;
	}

	@Override
	public Request updateRequest(Request change) {
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
	public Request deleteRequest(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;

		Request rq = sess.get(Request.class, id);
		try {
			tx = sess.beginTransaction();
			sess.delete(rq);
			tx.commit();
			
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return rq;
	}

}

package dev.clay.repos;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dev.clay.models.EventType;
import dev.clay.util.HibernateUtil;

public class EventTypeRepoImpl implements EventTypeRepo {

	@Override
	public EventType getEventType(int id) {
		Session sess = HibernateUtil.getSession();
		EventType et = null;
		
		try {
			et = sess.get(EventType.class, id);
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return et;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EventType> getAllEventTypes() {
		Session sess = HibernateUtil.getSession();
		List<EventType> eventTypes = null;
		
		try {
			eventTypes = sess.createQuery("FROM EventType").list();
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return eventTypes;
	}

	@Override
	public EventType addEventType(EventType et) {
		Session sess = HibernateUtil.getSession();
		
		try {
			sess.beginTransaction();
			et.setId((int)sess.save(et));
			sess.getTransaction().commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			sess.getTransaction().rollback();
			et = null;
		} finally {
			sess.close();
		}
		
		return et;
	}

	@Override
	public EventType updateEventType(EventType change) {
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
	public EventType deleteEventType(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		EventType et = sess.get(EventType.class, id);
		
		try {
			tx = sess.beginTransaction();
			sess.delete(et);
			tx.commit();
			
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return et;
	}

}

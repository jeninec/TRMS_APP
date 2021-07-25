package dev.clay.repos;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dev.clay.models.Feedback;
import dev.clay.util.HibernateUtil;

public class FeedbackRepoImpl implements FeedbackRepo {

	@Override
	public Feedback getFeedback(int id) {
		Session sess = HibernateUtil.getSession();
		Feedback f = null;

		try {
			f = sess.get(Feedback.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return f;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Feedback> getAllFeedback() {
		Session sess = HibernateUtil.getSession();
		List<Feedback> feedback = null;

		try {
			feedback = sess.createQuery("FROM Feedback").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return feedback;
	}

	@Override
	public Feedback addFeedback(Feedback f) {
		Session sess = HibernateUtil.getSession();

		try {
			sess.beginTransaction();
			f.setId((int) sess.save(f));
			sess.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			sess.getTransaction().rollback();
			f = null;
		} finally {
			sess.close();
		}

		return f;
	}

	@Override
	public Feedback updateFeedback(Feedback change) {
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
	public Feedback deleteFeedback(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;

		Feedback f = sess.get(Feedback.class, id);
		try {
			tx = sess.beginTransaction();
			sess.delete(f);
			tx.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}

		return f;
	}

}

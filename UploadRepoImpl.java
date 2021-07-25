package dev.clay.repos;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dev.clay.models.Upload;
import dev.clay.util.HibernateUtil;

public class UploadRepoImpl implements UploadRepo {

	@Override
	public Upload getUpload(int id) {
		Session sess = HibernateUtil.getSession();
		Upload u = null;
		
		try {
			u = sess.get(Upload.class, id);
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return u;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Upload> getAllUploads() {
		Session sess = HibernateUtil.getSession();
		List<Upload> uploads = null;
		
		try {
			uploads = sess.createQuery("FROM Upload").list();
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return uploads;
	}

	@Override
	public Upload addUpload(Upload u) {
		Session sess = HibernateUtil.getSession();
		
		try {
			sess.beginTransaction();
			u.setId((int)sess.save(u));
			sess.getTransaction().commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			sess.getTransaction().rollback();
			u = null;
		} finally {
			sess.close();
		}
		
		return u;
	}

	@Override
	public Upload updateUpload(Upload change) {
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
	public Upload deleteUpload(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;

		Upload u = sess.get(Upload.class, id);
		try {
			tx = sess.beginTransaction();
			sess.delete(u);
			tx.commit();
			
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return u;
	}

}

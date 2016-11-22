//package edu.myan.persistence;
//
//import edu.myan.common.exception.TechnicalException;
//import edu.myan.model.BaseEntity;
//
//import javax.persistence.*;
//import javax.transaction.Transactional;
//import javax.transaction.Transactional.TxType;
//import java.math.BigDecimal;
//import java.sql.Timestamp;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//
//@Transactional(value = TxType.REQUIRED)
//public class GenericDao<T extends BaseEntity> {
//
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	private Class<T> clazz;
//
//	private final String className;
//
//	public GenericDao(Class<T> clazz) {
//		this.setClazz(clazz);
//		this.className = clazz.getSimpleName();
//
//	}
//
//	public void setEntityManager(EntityManager entityManager) {
//		this.entityManager = entityManager;
//	}
//
//	public T load(long id) throws TechnicalException {
//
//		T entity = this.findById(id);
//		if (entity == null) {
//			throw new TechnicalException("entity " + this.className + "#" + id + " was not found", null);
//		}
//
//		return entity;
//
//	}
//
//	public T findById(long id) {
//		return this.entityManager.find(this.getClazz(), id);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> findAll() {
//
//		Query query = this.getEntityManager().createQuery("select e from " + this.className + " e ");
//		return query.getResultList();
//
//	}
//
//	public T save(final T object) {
//
//		if (object.getId() != null) {
//			return this.entityManager.merge(object);
//		} else {
//			this.entityManager.persist(object);
//
//			return object;
//		}
//	}
//
//	public void save(final T... objects) {
//		for (T object : objects) {
//			this.save(object);
//		}
//	}
//
//	public void save(final List<T> objects) {
//		for (T object : objects) {
//			this.save(object);
//		}
//	}
//
//	public void delete(final long id) throws UnsupportedOperationException, TechnicalException {
//		this.delete(this.load(id));
//	}
//
//	public void delete(final T object) throws UnsupportedOperationException {
//		this.entityManager.remove(object);
//	}
//
//	public void delete(final T... objects) throws UnsupportedOperationException {
//		this.deleteAll(Arrays.asList(objects), true);
//	}
//
//	public void delete(final List<T> list) throws UnsupportedOperationException {
//		this.deleteAll(list, true);
//	}
//
//	public void deleteAll() throws UnsupportedOperationException {
//		this.deleteAll(this.findAll(), false);
//	}
//
//	private void deleteAll(final Collection<T> objects, boolean checkIdDefault) throws UnsupportedOperationException {
//
//		for (T object : objects) {
//			this.entityManager.remove(object);
//		}
//	}
//
//	public void refresh(final T entity) {
//		this.entityManager.refresh(entity);
//	}
//
//	public void flushAndClear() {
//		this.entityManager.flush();
//		this.entityManager.clear();
//	}
//
//	public Query createQuery(String query) {
//		return this.getEntityManager().createQuery(query);
//	}
//
//	public Query createNamedQuery(String queryName) {
//		return this.getEntityManager().createNamedQuery(queryName);
//	}
//
//	public Query createNativeQuery(String query, Class<?> clazz) {
//		return this.getEntityManager().createNativeQuery(query, clazz);
//	}
//
//	public Query createNativeQuery(String query) {
//		return this.getEntityManager().createNativeQuery(query);
//	}
//
//	protected EntityManager getEntityManager() {
//		return this.entityManager;
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> getLimitedOrderedList(int max, String orderBy) {
//		Query query = this.getEntityManager()
//				.createQuery("select e from " + this.className + " e order by e." + orderBy + " desc");
//		query.setMaxResults(max);
//		return query.getResultList();
//
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> getOrderedList(String orderBy) {
//		Query query = this.getEntityManager()
//				.createQuery("select e from " + this.className + " e order by e." + orderBy);
//		return query.getResultList();
//	}
//
//	public List<Object[]> getResultOrNull(Query query) {
//		List<Object[]> results = query.getResultList();
//		if (results.isEmpty()) {
//			return null;
//		} else {
//			return results;
//		}
//	}
//
//	@SuppressWarnings("unchecked")
//	public T getSingleResultOrNull(Query query) {
//
//		List<T> results = query.getResultList();
//		if (results.isEmpty()) {
//			return null;
//		} else if (results.size() == 1) {
//			return results.get(0);
//		}
//
//		throw new NonUniqueResultException("This technical exception should not occur. Check data consistency in db.");
//	}
//
//	public Long getLongOrNull(Query query) {
//		try {
//			return (Long) query.getSingleResult();
//		} catch (NumberFormatException e) {
//			return null;
//		} catch (NoResultException e) {
//			return null;
//		}
//	}
//
//	public BigDecimal getBigDecimalOrNull(Query query) {
//		try {
//			return (BigDecimal) query.getSingleResult();
//		} catch (NumberFormatException e) {
//			return null;
//		} catch (NoResultException e) {
//			return null;
//		}
//	}
//
//	public Timestamp getTimeStampOrNull(Query query) {
//		return (Timestamp) query.getSingleResult();
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> getResultsOrNull_(Query query) {
//		List<T> results = query.getResultList();
//		if (results.isEmpty()) {
//			return null;
//		} else {
//			return results;
//		}
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> getResultsOrEmpty(Query query) {
//		List<T> results = query.getResultList();
//		return results;
//	}
//
//	public Class<T> getClazz() {
//		return this.clazz;
//	}
//
//	public void setClazz(Class<T> clazz) {
//		this.clazz = clazz;
//	}
//}

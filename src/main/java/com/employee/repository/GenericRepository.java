package com.employee.repository;

import javax.jdo.*;

/*
 * @Shoaib
 * 
 */

import javax.jdo.PersistenceManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.exception.RepositoryException;

public abstract class GenericRepository<T> 
{

	@Autowired
	private PersistenceManagerFactory persistenceManagerFactory;

	public PersistenceManager pm() 
	{
		return persistenceManagerFactory.getPersistenceManager();
	}

	public T save(T t) throws RepositoryException
	{
			try
			{
				PersistenceManager pm = persistenceManagerFactory.getPersistenceManager();
				T savedT = pm.makePersistent(t);
				return pm.detachCopy(savedT);
			} 
			catch (Exception e) 
			{
					throw new RepositoryException("Repo exception", e);
			}
	}
}


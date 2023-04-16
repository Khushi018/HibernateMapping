package com.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("UNIT");
		
	}
	public static EntityManager getConn() {
		return emf.createEntityManager();
	}
}

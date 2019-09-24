package com.employee;

import java.util.Properties;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {

	//public static PersistenceManagerFactory managerFactory = JDOHelper.getPersistenceManagerFactory("StoreData");

	@Bean
	public PersistenceManagerFactory getPersistenceManagerFactory() 
	{
		Properties prop = new Properties();
		prop.setProperty("javax.jdo.option.ConnectionURL", "jdbc:postgresql://localhost:5432/customerdb");
		prop.setProperty("javax.jdo.option.ConnectionDriverName", "org.postgresql.Driver");
		prop.setProperty("javax.jdo.option.ConnectionUserName", "postgres");
		prop.setProperty("javax.jdo.option.DetachAllOnCommit", "true");
		prop.setProperty("javax.jdo.option.Mapping", "postgres");
		prop.setProperty("javax.jdo.option.ConnectionPassword", "postgres");
		prop.setProperty("datanucleus.schema.autoCreateAll", "false");
		//prop.setProperty("spark.postgresql.datanucleus.autoCreateSchema", "true");
		//prop.setProperty("datanucleus.schema.autoCreateTables", "true");
		//prop.setProperty("spark.postgresql.datanucleus.fixedDatastore", "false");
		//prop.setProperty("datanucleus.autoCreateSchema", "true");
		//prop.setProperty("datanucleus.fixedDatastore", "false"); 

		
	//public PersistenceManagerFactory getPersistenceManagerFactory();
		//return managerFactory;
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory(prop);
		return pmf;
	}
}

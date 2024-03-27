package com.Cartera;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarteraApplication {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			// Configura y construye el sessionFactory
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

			// Abre una sesión de Hibernate
			session = sessionFactory.openSession();

			

			if(session != null){
				System.out.println( "conexion exitosa");
			}else{
				System.out.println( "conexio no exitosa");
			}



		} catch (Exception e) {
			// Manejo de la excepción
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();

		} finally {
			// Cierra la sesión de Hibernate
			if (session != null) {
				session.close();
			}
			// Cierra el sessionFactory al finalizar la aplicación
			if (sessionFactory != null) {
				sessionFactory.close();
			}
		}
	}
}

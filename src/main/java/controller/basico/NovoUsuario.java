package controller.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrud");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario("Fabio","Fabio@teste.com.br",80.1);
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}
}

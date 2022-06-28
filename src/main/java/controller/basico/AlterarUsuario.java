package controller.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.basico.Usuario;

public class AlterarUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrud");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 1L);
		//Desassociar o objeto atual do banco
		em.detach(usuario);
		
		usuario.setNome("Fabio Alterado");
		
		em.merge(usuario);
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}
}

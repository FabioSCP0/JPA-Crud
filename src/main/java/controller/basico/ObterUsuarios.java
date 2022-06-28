package controller.basico;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrud");
		EntityManager em = emf.createEntityManager();
			
		String jpql = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);
		
		List<Usuario> usuarios = query.getResultList();
		for (Usuario usuario : usuarios) {
			System.out.println("ID: " + usuario.getNome() + " Nome: " + usuario.getNome() + " Email: " + usuario.getEmail());
		}
		
		emf.close();
		em.close();
	}
}

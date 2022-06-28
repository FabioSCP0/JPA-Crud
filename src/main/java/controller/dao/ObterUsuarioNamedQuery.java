package controller.dao;

import java.util.List;

import infra.DAO;
import model.basico.Usuario;

public class ObterUsuarioNamedQuery {
	public static void main(String[] args) {
		DAO<Usuario> dao = new DAO<Usuario>(Usuario.class);
		List<Usuario> usuarios = dao.consultar("obterUsuarioComPesoMaiorQue","peso", 50.0);
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}
		dao.fechar();
	}
}

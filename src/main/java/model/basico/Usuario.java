package model.basico;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome", length = 200, nullable = false)
	private String nome;
	
	@Column(name =  "email", length = 200, nullable = false)
	private String email;

	@Column(name = "peso", nullable = false, scale = 2)
	private Double peso;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String email, Double peso) {
		super();
		this.nome = nome;
		this.email = email;
		this.peso = peso;
		if(peso.doubleValue() >= 0.0) this.peso = peso;
		else this.peso = 0.0;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}

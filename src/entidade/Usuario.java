package entidade;

import java.util.ArrayList;


public class Usuario {
	private String nome;
	private String email;
	private String cpf;
	private boolean bloquear;
	
	public static ArrayList<Pruu> pruu = new ArrayList<>(); 
	
	
	
	public void cadastrarPruu(Pruu pru) {
		pruu.add(pru);
	}
	
	
	public void darLike(Pruu like) {
		like.somarLike();		
	}
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nome, String email, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		
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
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static ArrayList<Pruu> getPruu() {
		return pruu;
	}

	public void setPruu(ArrayList<Pruu> pruu) {
		
		Usuario.pruu = pruu;
	}




	
	

	
	
}
package entidade;

public class Administrador extends Usuario {
	
	private Pruu pruu;

	public Administrador() {
		super();
	}

	public Administrador(String nome, String email, String cpf) {
		super(nome, email, cpf);
	}

	public void setBloaquear(Pruu pruu) {
		pruu.setBloquear(true);
	}
	
}
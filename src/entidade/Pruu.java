package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Pruu {
	private int id = ThreadLocalRandom.current().nextInt(25);
	private String texto;
	private Date data = new Date();
	private int like;
	private boolean bloquear = false;
	private Usuario usuario;
	private String dataFormatada;

	
	public void somarLike() {
		like++;
	}
	
	public Pruu() {
		super();
	}

	public Pruu(String texto, Usuario usuario) {
		super();
		if((texto.length() > 300) || (texto.trim().length() < 1)) {
			System.out.println("Texto excede o limite de character");
			this.bloquear = true;
		}
		this.texto = texto;	
		this.usuario = usuario;
		SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
		String dataformatada = formatador.format(data);
		this.dataFormatada = dataformatada;
	}

	public int getId() {		 
		return id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}	

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public boolean isBloquear() {
		return bloquear;
	}

	public void setBloquear(boolean bloquear) {
		this.bloquear = bloquear;
	}

	@Override
	public String toString() {
		if (isBloquear()) {
			return ""+"\nPruu" + "\nid: " + this.id +"\nUsuario: " + usuario.getNome() + "\nBloqueado" + "\n";
		}
		return ""+"\nPruu" + "\nid: " + this.id + "\nUsuario: " + usuario.getNome() +"\nTexto: " + this.texto + "\nLikes: " + this.like
				+ "\nData: " + this.dataFormatada + "\n";
	}
	
	
}

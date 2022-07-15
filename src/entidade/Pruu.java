package entidade;

import java.util.Date;

public class Pruu {
	private int id;
	private String texto;
	private Date data;
	private int like;
	private boolean bloquear;
	
	public Pruu() {
		super();
	}

	public Pruu(int id, String texto, Date data, int like, boolean bloquear) {
		super();
		this.id = id;
		this.texto = texto;
		this.data = data;
		this.like = like;
		this.bloquear = bloquear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setData(Date data) {
		this.data = data;
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
		return "Pruu [id=" + id + ", texto=" + texto + ", data=" + data + ", like=" + like + ", bloquear=" + bloquear
				+ "]";
	}
	
	
}

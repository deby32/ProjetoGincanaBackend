package br.edu.ifba.BackGincana.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_imagem")
public class ImagemModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Imagem", nullable = false)
	private Integer id_Imagem;

	@Column(name = "URL_Imagem", length = 400, nullable = false)
	private String URL_Imagem;
	
	@ManyToOne
	@JoinColumn(name = "id_Galeria")
	private GaleriaModel galeria;

	public ImagemModel() {
		super();
	}

	public ImagemModel(Integer id_Imagem, String uRL_Imagem) {
		super();
		this.id_Imagem = id_Imagem;
		URL_Imagem = uRL_Imagem;
	}

	public Integer getId_Imagem() {
		return id_Imagem;
	}

	public void setId_Imagem(Integer id_Imagem) {
		this.id_Imagem = id_Imagem;
	}

	public String getURL_Imagem() {
		return URL_Imagem;
	}

	public void setURL_Imagem(String uRL_Imagem) {
		URL_Imagem = uRL_Imagem;
	}
	

	@Override
	public String toString() {
		return "ImagemModel [id_Imagem=" + id_Imagem + ", URL_Imagem=" + URL_Imagem + ", galeria=" + galeria + "]";
	}

	
	
	
	

}

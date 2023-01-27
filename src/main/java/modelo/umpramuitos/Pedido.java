package modelo.umpramuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date data;
	
	@OneToMany(mappedBy = "pedido")
	private List<ItemDePedido> itens;

	
	public Pedido() {
		this (new Date());

	}
	
	public Pedido( Date data) {
		this.data = data;
	}
	
	

	public List<ItemDePedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemDePedido> itens) {
		this.itens = itens;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	
	
	
	
	
	
}

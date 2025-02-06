package com.senai.ecommerce.entities;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ItemDoPedido")
public class ItemDoPedido {
	
	@EmbeddedId
	private ItemDoPedidoPK id = new ItemDoPedidoPK();

      private Integer quantidade;
      private Double preco;
     
      
	public ItemDoPedido() {
		
	}


	public ItemDoPedido(Pedido pedido, Produto produto, Integer quantidade, Double preco) {
		id.setPedido(pedido);
		id.setProduto(produto);
		this.quantidade = quantidade;
		this.preco = preco;
	}


	public Pedido getPedido() {
		return id.getPedido();
	}


	public void setproduto(Produto produto) {
	id.setProduto(produto);
	}
	
	public Produto getproduto() {
		return id.getProduto();
	}


	public void setpedido(Pedido pedido) {
	id.setPedido(pedido);
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	
      

}
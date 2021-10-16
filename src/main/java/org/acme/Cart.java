package org.acme;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.acme.DTO.CartDto;


@Entity
@Table(name="cart")
public class Cart {

    @Id
    private UUID id;
    private Long productId;
    private Integer quantity;

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



    public Cart() {
    }

    public Cart(CartDto cartDto){
        this.productId = cartDto.getProductId();
        this.quantity = cartDto.getQuantity();
    }
    
    
}

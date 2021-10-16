package org.acme.DTO;

import java.util.UUID;

import org.acme.Cart;

public class AddToCartDto {
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

    public AddToCartDto() {
    }

    public AddToCartDto(UUID id, Long productId, Integer quantity) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
    }

    public AddToCartDto(Cart cart){
        this.setId(cart.getId());
        this.setProductId(cart.getProductId());
        this.setQuantity(cart.getQuantity());
    }


    
}

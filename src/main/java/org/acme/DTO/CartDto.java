package org.acme.DTO;

import java.util.List;

public class CartDto {
    private List<CartItemDto> cartItems;

    public CartDto(List<CartItemDto> cartItemDtoList) {
        this.cartItems = cartItemDtoList;
    }

    public List<CartItemDto> getCartItems() {
        return this.cartItems;
    }

    public void setCartItems(List<CartItemDto> cartItems) {
        this.cartItems = cartItems;
    }

    
}

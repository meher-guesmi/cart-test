package org.acme;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

public class CartService {
    @Inject
    CartRepository cartRepository;

    public List<Cart> findAll(){
        return cartRepository.findAll();
    }

    public Cart findById(UUID id){
        return cartRepository.findById(id);
    }

    public Cart create(Cart c){
        return cartRepository.insert(c);
    }

    public Cart update(Cart c){
        return cartRepository.update(c);
    }

    public void remove(UUID id){
        cartRepository.delete(id);
    }


    
}

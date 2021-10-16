package org.acme;

import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class CartRepository {

    @Inject
    EntityManager em;

    public List<Cart> findAll(){
        List<Cart> l;
        return l;
    }

    public Cart findById(UUID id){
        Cart c = null;
        return c;
    }

    @Transactional
    public Cart insert(Cart c){
        return c;
    }

    @Transactional
    public Cart update(Cart c){
        return c;
    }

    @Transactional
    public void delete(UUID id){
    }

    
}

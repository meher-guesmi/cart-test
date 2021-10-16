package org.acme;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cart")
public class CartResource {

    @Inject
    CartService cartService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    public String getItems(){
        return "Cart Items";
    }

    @POST
    public String addItem(){
        return "Item added to Cart";
    }

    @PUT
    @Path("/{cartItemId}")
    public String update(){
        return "update item from cart";
        //return cartService.update();
    }

    @DELETE
    @Path("/{cartItemId}")
    public String delete(){
        return "delete item from cart";
        //return cartService.delete();
    }
}

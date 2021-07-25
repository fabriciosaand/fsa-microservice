package br.com.fabriciosaand.shoppingcart.repository;

import br.com.fabriciosaand.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}

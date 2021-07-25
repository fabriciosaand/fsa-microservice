package br.com.fabriciosaand.shoppingcart.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@Data
@NoArgsConstructor
@RedisHash("item")
public class Item {

    private Integer productId;
    private Integer amount;

}

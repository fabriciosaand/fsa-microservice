package br.com.fabriciosaand.productcatalog.repository;

import br.com.fabriciosaand.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

}

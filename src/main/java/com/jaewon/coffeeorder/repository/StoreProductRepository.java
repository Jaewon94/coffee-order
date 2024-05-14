package com.jaewon.coffeeorder.repository;

import com.jaewon.coffeeorder.domain.StoreProduct;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StoreProductRepository extends CrudRepository<StoreProduct, Integer> {

    Optional<StoreProduct> findByStoreIdAndProductId(int storeId, int productId);

}

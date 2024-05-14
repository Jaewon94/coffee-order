package com.jaewon.coffeeorder.service;

import com.jaewon.coffeeorder.domain.StoreProduct;
import com.jaewon.coffeeorder.repository.StoreProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreProductRepository storeProductRepository;

    public StoreProduct getStoreProduct(int storeId, int productId) {
        Optional<StoreProduct> storeProductOptional = storeProductRepository.findByStoreIdAndProductId(storeId, productId);

        if(storeProductOptional.isEmpty()) {
            throw new RuntimeException("존재하지 않습니다.");

        }
        return storeProductOptional.get();
    }

    public void saveAll(List<StoreProduct> storeProducts) {
        storeProductRepository.saveAll(storeProducts);
    }
}

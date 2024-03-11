package com.chanwoong.springsecurywithjwt.service.impl;


import com.chanwoong.springsecurywithjwt.data.dto.ProductDto;
import com.chanwoong.springsecurywithjwt.data.dto.ProductResponseDto;
import com.chanwoong.springsecurywithjwt.data.entity.Product;
import com.chanwoong.springsecurywithjwt.data.repository.ProductRepository;
import com.chanwoong.springsecurywithjwt.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service        // Service임을 명시
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;        // 생성자 필요하므로, RequiredArgsContructor 호출
    @Override
    public ProductResponseDto getProduct(Long number) {
        Product product = productRepository.findById(number).orElseThrow(RuntimeException::new);

        // ProductResponseDto에 값 채워줌
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setNumber(product.getNumber());
        productResponseDto.setName(product.getName());
        productResponseDto.setPrice(product.getPrice());
        productResponseDto.setStock(product.getStock());

        return productResponseDto;
    }

    @Override
    public ProductResponseDto saveProduct(ProductDto productDto) {
        Product product = new Product();

        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setStock(productDto.getStock());
        product.setCreatedAt(LocalDateTime.now());
        product.setUpdateAt(LocalDateTime.now());

        Product savedProduct = productRepository.save(product);

        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setNumber(savedProduct.getNumber());
        productResponseDto.setName(savedProduct.getName());
        productResponseDto.setPrice(savedProduct.getPrice());
        productResponseDto.setStock(savedProduct.getStock());

        return productResponseDto;
    }

    @Override
    public ProductResponseDto changeProductName(Long number, String name) throws Exception {
        Product changedProduct = productRepository.findById(number).orElseThrow(RuntimeException::new);

        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setNumber(changedProduct.getNumber());
        productResponseDto.setName(changedProduct.getName());
        productResponseDto.setPrice(changedProduct.getPrice());
        productResponseDto.setStock(changedProduct.getStock());

        return productResponseDto;
    }

    @Override
    public void deleteProduct(Long number) throws Exception {
        productRepository.deleteById(number);
    }
}

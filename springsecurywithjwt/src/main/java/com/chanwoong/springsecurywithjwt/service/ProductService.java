package com.chanwoong.springsecurywithjwt.service;

import com.chanwoong.springsecurywithjwt.data.dto.ProductDto;
import com.chanwoong.springsecurywithjwt.data.dto.ProductResponseDto;

public interface ProductService {

    ProductResponseDto getProduct(Long number);

    ProductResponseDto saveProduct(ProductDto productDto);

    ProductResponseDto changeProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;

}